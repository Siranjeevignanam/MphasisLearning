package project.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.dao.UserDao;
import project.model.QuizResult;

@WebServlet("/quizLeaderboard")
public class QuizResultServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int quizId = Integer.parseInt(request.getParameter("quizId"));
        UserDao dao = new UserDao();
        List<QuizResult> leaderboard = dao.getLeaderboard(quizId);

        request.setAttribute("leaderboard", leaderboard);
        request.setAttribute("quizId", quizId);

        RequestDispatcher rd = request.getRequestDispatcher("leaderboard.jsp");
        rd.forward(request, response);
    }
}
