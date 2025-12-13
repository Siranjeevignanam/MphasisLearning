<%@ page import="java.util.List" %>
<%@ page import="project.model.Quiz" %>
<!DOCTYPE html>
<html>
<head>
<title>Quiz List</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f6f9;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: flex-start;
        min-height: 100vh;
    }

    .container {
        background: #fff;
        margin-top: 50px;
        padding: 30px 40px;
        border-radius: 10px;
        box-shadow: 0 4px 12px rgba(0,0,0,0.1);
        width: 500px;
    }

    h2 {
        text-align: center;
        color: #333;
        margin-bottom: 20px;
    }

    ul {
        list-style: none;
        padding: 0;
        margin: 0;
    }

    li {
        background-color: #f9f9f9;
        margin: 10px 0;
        padding: 12px 15px;
        border-radius: 6px;
        font-size: 16px;
        color: #444;
        display: flex;
        justify-content: space-between;
        align-items: center;
        transition: background-color 0.3s ease;
    }

    li:hover {
        background-color: #e9ecef;
    }

    a {
        text-decoration: none;
        color: #007bff;
        font-weight: bold;
        transition: color 0.3s ease;
    }

    a:hover {
        color: #0056b3;
    }

    .no-quizzes {
        text-align: center;
        color: #777;
        font-style: italic;
    }

    .quiz-title {
        font-weight: 600;
        color: black;
    }
</style>
</head>
<body>
<div class="container">
    <h2>Available Quizzes</h2>

    <%
        List<Quiz> quizzes = (List<Quiz>) request.getAttribute("quizzes");
        if (quizzes != null && !quizzes.isEmpty()) {
    %>
        <ul>
        <%
            for (Quiz quiz : quizzes) {
        %>
            <li>
                <span class="quiz-title"><%= quiz.getTitle() %></span>
                <!-- Add a link to take quiz -->
                
            </li>
        <%
            }
        %>
        </ul>
    <%
        } else {
    %>
        <p class="no-quizzes">No quizzes available.</p>
    <%
        }
    %>

   
</div>
</body>
</html>
