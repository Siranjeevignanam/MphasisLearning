package project.controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import project.dao.AdminDao;
import project.dao.QuestionDao;
import project.model.Question;

@WebServlet("/editQuestion")
public class EditQuestionServlet extends HttpServlet {
   AdminDao dao = new AdminDao();

    // Show the edit form
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        Question q = dao.getQuestionById(Integer.parseInt(id));
        request.setAttribute("question", q);
        RequestDispatcher rd = request.getRequestDispatcher("editQuestion.jsp");
        rd.forward(request, response);
    }

    // Handle form submission
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Question q = new Question();
        q.setId(Integer.parseInt(request.getParameter("id")));
        q.setQuestion(request.getParameter("question"));
        q.setOption_a(request.getParameter("option_a"));
        q.setOption_b(request.getParameter("option_b"));
        q.setOption_c(request.getParameter("option_c"));
        q.setOption_d(request.getParameter("option_d"));
        q.setAnswer(request.getParameter("answer"));

        dao.updateQuestion(q);

        response.sendRedirect("updateServlet"); // back to list
    }
}
