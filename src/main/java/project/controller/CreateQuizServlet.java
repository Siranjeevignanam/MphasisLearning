package project.controller;

import java.io.IOException;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import project.dao.AdminDao;
import project.model.Quiz;

@WebServlet("/createQuiz")
public class CreateQuizServlet extends HttpServlet {
    private AdminDao dao = new AdminDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String title = request.getParameter("title");
        String[] selectedIds = request.getParameterValues("questionIds");

        List<Integer> questionIds = new ArrayList<>();
        if (selectedIds != null) {
            for (String id : selectedIds) {
                questionIds.add(Integer.parseInt(id));
            }
        }

        Quiz quiz = new Quiz();
        quiz.setTitle(title);

        dao.saveQuiz(quiz, questionIds);

        response.sendRedirect("quizList"); // show list of quizzes
    }
}
