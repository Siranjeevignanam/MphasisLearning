package project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.dao.QuestionDao;

@WebServlet("/deleteQuestion")
public class DeleteQuestionServlet extends HttpServlet {
     QuestionDao dao = new QuestionDao();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id =request.getParameter("id");
        int result=dao.deleteQuestion(Integer.parseInt(id));
       System.out.println(result);
        response.sendRedirect("updateServlet");
    }
}
