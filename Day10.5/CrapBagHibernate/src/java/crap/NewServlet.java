/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crap;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class NewServlet extends HttpServlet {
    
    Session session = HibernateUtil.getSessionFactory().getCurrentSession();

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
//        User user = new User();
//        user.setId(101l);
//        user.setFirstName("Billy");
//        user.setLastName("Joel");
        
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = this.session.beginTransaction();
        NewEntity entity = new NewEntity("Apex", 12);
        Sparkler spark = new Sparkler();
        spark.setName("Sue");
        entity.setSparkler(spark);
        spark.entities.add(entity);
        this.session.save(spark);
        this.session.save(entity);
        
        tx.commit();
        

//        Transaction tx = this.session.beginTransaction();
//        NewEntity ne = (NewEntity)session.get(NewEntity.class, 6l);
//        if (ne != null) {
//            //  Delete something
////            session.delete(ne);
//            
//            //  Edit something
////            ne.setBar(666);
////            ne.setFoo("fighter");
//        }
//        else
//            System.out.println("No entity...");
//        tx.commit();
        
//        this.session.save(user);
        
        processRequest(request, response);
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
