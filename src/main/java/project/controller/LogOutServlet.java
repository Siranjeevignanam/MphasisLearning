package project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LogoutServlet")
public class LogOutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {
        HttpSession session = req.getSession(false);
        if (session != null) session.invalidate();

        // Set message as request attribute
        req.setAttribute("msg", "Logged out successfully.");

        // Forward internally to JSP
        RequestDispatcher rd = req.getRequestDispatcher("Adminlogin.jsp");
        rd.forward(req, res);
    }
}
