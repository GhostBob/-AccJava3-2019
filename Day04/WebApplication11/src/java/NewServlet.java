/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewServlet extends HttpServlet {
    
    public static final String emailLocation = "/WEB-INF/emailList.txt";

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        
        String fooVal = this.getServletContext().getInitParameter("foo");
        System.out.println(fooVal);
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
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("/WebApplication11/index.jsp");
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
        String hidden = request.getParameter("form");
        if ("subscribe".equals(hidden)) {
            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            String email = request.getParameter("email");
            if (firstname == null || firstname.isEmpty() || lastname == null
                    || lastname.isEmpty() || email == null || email.isEmpty()) {
                request.setAttribute("errors", "You have to fill out the WHOLE form, dumbass.");
                request.setAttribute("firstname", firstname);
                request.setAttribute("lastname", lastname);
                request.setAttribute("email", email);
                getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
                return;
            }
            System.out.println(String.format("First: %s, Last: %s, Email: %s", firstname, lastname, email));
            String filePath = getServletContext().getRealPath("/WEB-INF/EmailList.txt");
            try {
                BufferedWriter out = new BufferedWriter(
                        new FileWriter(filePath));
                out.write(email);
                out.close();
            } catch (IOException e) {
                System.out.println("Exception Occurred" + e);
            }
            request.setAttribute("firstname", firstname);
            request.setAttribute("lastname", lastname);
            request.setAttribute("email", email);
            getServletContext().getRequestDispatcher("/thanks.jsp").forward(request, response);
        } else {
            response.sendRedirect("/WebApplication11/index.jsp");
        }
    }

    public int x = 1;

    private void foo() {
        if (true) {
            int x = 3;
            bar();
            System.out.println(x);
        }
    }

    private void bar() {
        int x = 2;
    }

    private void blah() {
        x = 3;
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
