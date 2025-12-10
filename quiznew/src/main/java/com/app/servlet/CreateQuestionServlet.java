package com.app.servlet;
//import java.io.*; import javax.servlet.*; import javax.servlet.http.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.*;

@WebServlet
public class CreateQuestionServlet extends HttpServlet{
 protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws IOException,ServletException
 {
  try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","root")){
   PreparedStatement ps=con.prepareStatement("insert into questions(question,opt1,opt2,opt3,opt4,answer) values(?,?,?,?,?,?)");
   ps.setString(1,req.getParameter("q")); ps.setString(2,req.getParameter("o1"));
   ps.setString(3,req.getParameter("o2")); ps.setString(4,req.getParameter("o3"));
   ps.setString(5,req.getParameter("o4")); ps.setString(6,req.getParameter("ans"));
   ps.executeUpdate(); resp.sendRedirect("adminHome.jsp");
  }catch(Exception e){ throw new ServletException(e);}
 }
}