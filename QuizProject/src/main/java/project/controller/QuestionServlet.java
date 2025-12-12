package project.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.dao.QuestionDao;
import project.model.Question;


@WebServlet("/createQuestion")
public class QuestionServlet extends HttpServlet {

	    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
	        String q = req.getParameter("q");
	        String o1 = req.getParameter("o1");
	        String o2 = req.getParameter("o2");
	        String o3 = req.getParameter("o3");
	        String o4 = req.getParameter("o4");
	        String ans = req.getParameter("ans");
Question question=new Question(q,o1,o2,o3,o4,ans);
	        QuestionDao dao = new QuestionDao();
	        try {
	            dao.insertQuestion(question);
	            resp.sendRedirect("dashboard.jsp");
	        } catch (Exception e) {
	            throw new ServletException(e);
	        }
	    }
	}

	  
	  
	  
	  

