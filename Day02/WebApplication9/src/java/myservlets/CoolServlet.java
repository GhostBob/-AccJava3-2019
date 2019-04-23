package myservlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import notservlets.Calculator;

@WebServlet(urlPatterns = {"/CoolServlet", "/Hahaha"})
public class CoolServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CoolServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CoolServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
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
        response.setContentType("text/html;charset=UTF-8");
        String firstVal = request.getParameter("firstval");
        String secondVal = request.getParameter("secondval");

        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CoolServlet</title>");
            if (firstVal != null && secondVal != null) {
                double firstNumber = Double.parseDouble(firstVal);
                double secondNumber = Double.parseDouble(secondVal);
                Calculator calc = new Calculator();
                calc.add(firstNumber);
                calc.multiply(secondNumber);
                double total = calc.getTotal();
                out.println("<div>Your total is: " + total + "</div>");
            }
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>You POSTed to me!</h1>");

            Map<String, String[]> paramNames = request.getParameterMap();
            for (String key : paramNames.keySet()) {
                String[] vals = paramNames.get(key);
                out.println(key + ":<br>");
                for (String val : vals) {
                    out.println("  " + val + "<br>");
                }
            }

            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CoolServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>You called DELETE</h1>");
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
