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
import project.dao.UserDao;
import project.model.Admin;
import project.model.User;


//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

	@WebServlet("/UserServlet")
	public class UserLoginServlet extends HttpServlet {

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	        User user = new User();
	        User validUser = null;

	        
	        user.setName(request.getParameter("name")); 
	       user.setPassword(request.getParameter("password"));

	        UserDao dao=new UserDao();
	        validUser = dao.validate(user);

	        if (validUser != null) {
	            HttpSession session = request.getSession();
	            session.setAttribute("user", validUser);
	            session.setAttribute("name", request.getParameter("name"));
	            response.sendRedirect(request.getContextPath() + "/userdashboard.jsp"); 
	        } else {
	        	request.setAttribute("msg", "Invalid Credentials.");
	        	RequestDispatcher rd = request.getRequestDispatcher("userlogin.jsp");
	        	rd.forward(request, response);

	        }
	    }
	}


