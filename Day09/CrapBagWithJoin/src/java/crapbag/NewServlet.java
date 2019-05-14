/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crapbag;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class NewServlet extends HttpServlet {

    private static ConnectionPool connectionPool = ConnectionPool.getInstance();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String requestedPage = request.getParameter("foo");
        if ("rab".equals(requestedPage)) {
            //Go to page 1
        } else if ("bar".equals(requestedPage)) {
            //Go to page 2
        }
        List<InventoryItem> items = new ArrayList();
        try {
            Connection connection = connectionPool.getConnection();
            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery("select * from inventory inner join distributor_inventory on inventory.id=distributor_inventory.inventory_id inner join distributor on distributor_inventory.distributor_id=distributor.id order by inventory.id;");
            while (results.next()) {
                items.add(makeItem(results));
            }
            connectionPool.freeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(NewServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        request.setAttribute("items", items);
        getServletContext().getRequestDispatcher("/shop.jsp").forward(request, response);
    }

    private InventoryItem makeItem(ResultSet results) throws SQLException {
        int dist_id = results.getInt("distributor_id");
        String dist_name = results.getString("name");
        int id = results.getInt("id");
        String description = results.getString("description");
        double price = results.getDouble("cost");
        InventoryItem item = new InventoryItem(id, description, price);
        item.setDistributorName(dist_name);
        return item;
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idString = request.getParameter("addToCart");
        int itemId = Integer.parseInt(idString);
        System.out.println(itemId);

        HttpSession session = request.getSession();
        List<InventoryItem> cart = (List) session.getAttribute("cart");
        if (cart == null) {
            cart = new ArrayList();
            session.setAttribute("cart", cart);
        }

        try {
            Connection connection = connectionPool.getConnection();
            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery("select * from inventory where inventory.id = " + itemId + ";");
            while (results.next()) {
                InventoryItem item = makeItem(results);
                cart.add(item);
                System.out.println("Added item: " + item);

                Double total = (Double) session.getAttribute("total");
                if (total == null) {
                    total = new Double(0);
                }
                total += item.getPrice();
                session.setAttribute("total", total);
                connectionPool.freeConnection(connection);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        response.sendRedirect(getServletContext().getContextPath());
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
