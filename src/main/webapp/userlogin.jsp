<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>User Login</title>
<style>
    .container {
        display: flex;
        flex-direction: column;
        align-items: center;
    }

    .msg-box {
        background-color: #f8d7da;   /* red background for errors */
        color: #721c24;
        padding: 10px;
        border-radius: 5px;
        margin-top: 15px;
        width: 300px;
        text-align: center;
    }

    body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }

    form {
        background-color: #fff;
        padding: 20px 30px;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0,0,0,0.1);
        width: 300px;
        margin-bottom: 15px;
    }

    label {
        display: block;
        margin-bottom: 5px;
        font-weight: bold;
    }

    input[type="text"],
    input[type="password"] {
        width: 100%;
        padding: 8px;
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 4px;
    }

    button {
        width: 100%;
        padding: 10px;
        background-color: #007bff; /* blue for login */
        color: white;
        border: none;
        border-radius: 4px;
        font-size: 16px;
        cursor: pointer;
    }

    button:hover {
        background-color: #0056b3;
    }

    a {
        display: block;
        margin-top: 10px;
        text-align: center;
        color: #007bff;
        text-decoration: none;
    }

    a:hover {
        text-decoration: underline;
    }
</style>
</head>
<body>
<div class="container">
    <h1>User Login</h1>
    <form action="UserServlet" method="post">
        <label for="username">Username</label>
        <input type="text" id="username" name="name" placeholder="Enter your username" required>

        <label for="password">Password</label>
        <input type="password" id="password" name="password" placeholder="Enter your password" required>

        <button type="submit">Login</button>
    </form>

    <%
        String message = (String)request.getAttribute("msg");
        if (message != null) {
    %>
        <div class="msg-box">
            <%= message %>
        </div>
    <%
        }
    %>

    <a href="newUser.jsp">New User? Sign up</a>
</div>
</body>
</html>
