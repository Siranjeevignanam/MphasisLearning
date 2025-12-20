package project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.dao.UserDao;

@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet 
{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		UserDao dao=new UserDao();
		dao.addUser(name, password);
		req.setAttribute("msg", "User added successfully");
		RequestDispatcher rd= req.getRequestDispatcher("userLogin.jsp");
		rd.forward(req, res);
		
	}

}
