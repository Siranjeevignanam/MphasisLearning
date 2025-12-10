package com.project.controller;

import java.io.IOException;

import com.project.dao.AdminDao;
import com.project.model.Admin;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/AdminServlet")
public class AdminLogin extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
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
