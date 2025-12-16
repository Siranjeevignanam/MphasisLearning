<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="project.model.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Dashboard</title>
<style>
body {
    font-family: Arial, sans-serif;
    background-color: #f4f6f9;
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
}

.container {
    background: #fff;
    padding: 30px 40px;
    border-radius: 10px;
    box-shadow: 0 4px 12px rgba(0,0,0,0.1);
    text-align: center;
    width: 350px;
}

h2 {
    margin-bottom: 20px;
    color: #333;
}

button {
    width: 100%;
    padding: 12px;
    background-color: #007bff;
    color: white;
    border: none;
    border-radius: 6px;
    font-size: 16px;
    cursor: pointer;
    transition: background-color 0.3s ease;
}

button:hover {
    background-color: #0056b3;
}
</style>
</head>
<body>

<div class="container">
    <%
        User user = (User) session.getAttribute("user");
        if (user != null) {
    %>
        <h2>Welcome, <%= user.getName() %>!</h2>
    <%
        }
    %>

    <a href="quizList"><button class="button">Take Quiz</button></a>
</div>

</body>
</html>
