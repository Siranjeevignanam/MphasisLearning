package project.controller;

/*import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;*/
import project.dao.QuestionDao;
import project.model.Question;
import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/takeQuiz")
public class TakeQuizServlet extends HttpServlet {

    private QuestionDao dao = new QuestionDao();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int quizId = Integer.parseInt(request.getParameter("quizId"));
        List<Question> questions = dao.getQuestionsByQuizId(quizId);
System.out.println(questions);
        request.setAttribute("questions", questions);
        request.setAttribute("quizId", quizId);
        request.getRequestDispatcher("takeQuiz.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int quizId = Integer.parseInt(request.getParameter("quizId"));
        List<Question> questions = dao.getQuestionsByQuizId(quizId);

        int score = 0;
        Map<Integer, String> userAnswers = new HashMap<>();

        for (Question q : questions) {
            String selected = request.getParameter("q" + q.getId());
            userAnswers.put(q.getId(), selected);
            if (selected != null && selected.equalsIgnoreCase(q.getAnswer())) {
                score++;
            }
        }

        request.setAttribute("questions", questions);
        request.setAttribute("quizId", quizId);
        request.setAttribute("score", score);
        request.setAttribute("userAnswers", userAnswers);
        request.getRequestDispatcher("takeQuiz.jsp").forward(request, response);
    }
}
