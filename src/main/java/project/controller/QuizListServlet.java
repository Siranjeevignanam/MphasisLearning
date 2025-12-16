package project.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import project.dao.AdminDao;
import project.model.Quiz;

@WebServlet("/quizList")
public class QuizListServlet extends HttpServlet {
    private AdminDao dao = new AdminDao();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Quiz> quizzes = dao.getAllQuizzes();
        request.setAttribute("quizzes", quizzes);
        RequestDispatcher rd = request.getRequestDispatcher("quizList.jsp");
        rd.forward(request, response);
    }
}
