package project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import project.dao.AdminDao;
import project.model.Admin;




@WebServlet("/AdminServlet")
public class AdminLogin extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Admin admin = new Admin();
        Admin validAdmin = null;

        
        admin.setName(request.getParameter("name")); 
        admin.setPassword(request.getParameter("password"));

        AdminDao dao = new AdminDao();
        validAdmin = dao.validate(admin);

        if (validAdmin != null) {
            HttpSession session = request.getSession();
            session.setAttribute("admin", validAdmin);
            response.sendRedirect(request.getContextPath() + "/dashboard.jsp"); 
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("/error.jsp"); 
            rd.forward(request, response);
        }
    }
}
