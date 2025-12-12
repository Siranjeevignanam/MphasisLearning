package project.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.dao.QuestionDao;
import project.model.Question;

@WebServlet("/QuestionListServlet")
public class QuestionListServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
QuestionDao dao=new QuestionDao();
        try {
            List<Question> list = dao.getQuestions();
            request.setAttribute("questions", list);

            RequestDispatcher rd = request.getRequestDispatcher("listQuestion.jsp");
            rd.forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
