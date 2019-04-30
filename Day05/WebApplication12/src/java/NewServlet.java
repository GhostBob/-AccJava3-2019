/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

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
        
        request.setAttribute("name", "Robert");
        List<String> myList = new ArrayList();
        myList.add("Susan");
        myList.add("Pete");
        myList.add("Ben");
        myList.add("Carol");
        request.setAttribute("myList", myList);
        Map<String,Object> myMap = new HashMap();
        myMap.put("age", 39);
        myMap.put("height", "5' 11\"");
        myMap.put("gender", "fluid");
        myMap.put("weight", 1.21e21);
        request.setAttribute("myMap", myMap);
        User user = new User();
        user.firstName = "Tom";
        user.lastName = "Collins";
        request.setAttribute("user", user);
        
        Map<String, Object> myStuff = new HashMap();
        myStuff.put("colors", Arrays.asList("red", "yellow", "blue"));
        myStuff.put("age", 21);
        myStuff.put("name", "Bob");
        myStuff.put("origin", Arrays.asList(0, 1));
        Map<String, String> address = new HashMap();
        address.put("street", "102 Blah ave");
        address.put("city", "Austin");
        address.put("state", "Texas");
        address.put("zip", "78701");
        myStuff.put("address", address);
        request.setAttribute("map", myStuff);
        
//        String meh = true ? "whee" : "blah";
        getServletContext().getRequestDispatcher("/el-demo.jsp").forward(request, response);
    }
    
    public class User {
        private String firstName;
        private String lastName;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
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
        processRequest(request, response);
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
