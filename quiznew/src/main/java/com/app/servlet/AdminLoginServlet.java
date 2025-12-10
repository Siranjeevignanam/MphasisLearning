package com.app.servlet;
//import java.io.*; import javax.servlet.*; import javax.servlet.http.*;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet{
 protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException,ServletException{
  String u=req.getParameter("username"); String p=req.getParameter("password");
  if(u.equals("admin") && p.equals("admin")) resp.sendRedirect("adminHome.jsp");
  else { req.setAttribute("msg","Invalid"); req.getRequestDispatcher("adminLogin.jsp").forward(req,resp);}
 }
}