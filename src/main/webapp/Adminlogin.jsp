<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }

    .container {
        display: flex;
        flex-direction: column;
        align-items: center;
        background-color: #fff;
        padding: 30px 40px;
        border-radius: 8px;
        box-shadow: 0 0 12px rgba(0,0,0,0.1);
        width: 320px;
    }

    h1 {
        margin-bottom: 20px;
        color: #333;
        text-align: center;
    }

    form {
        width: 100%;
    }

    label {
        display: block;
        margin-bottom: 5px;
        font-weight: bold;
        color: #444;
    }

    input[type="text"],
    input[type="password"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 4px;
        font-size: 14px;
    }

    button {
        width: 100%;
        padding: 12px;
        background-color: #007bff;
        color: white;
        border: none;
        border-radius: 4px;
        font-size: 16px;
        cursor: pointer;
        transition: background-color 0.3s ease;
    }

    button:hover {
        background-color: #0056b3;
    }

    .msg-box {
        background-color: #d4edda;
        color: #155724;
        padding: 10px;
        border-radius: 5px;
        margin-top: 15px;
        width: 100%;
        text-align: center;
        font-size: 14px;
    }
</style>
</head>

<body>
<div class="container">
    <h1>Admin Login</h1>
    <form action="AdminServlet" method="get">
        <label for="username">Username</label>
        <input type="text" id="username" name="name" placeholder="Enter your username" required>

        <label for="password">Password</label>
        <input type="password" id="password" name="password" placeholder="Enter your password" required>

        <button type="submit">Login</button>
    </form>

    <%
        String message = (String)request.getAttribute("msg");
        if (message != null && message.equals("Invalid Credentials.")) {
    %>
        <div class="msg-box">
            <%= message %>
        </div>
    <%
        }
        
        else if (message != null && message.equals("Logged out successfully.")) {
        		    %>
        		     <div class="msg-box">
            <%= message %>
        </div>
     <%} %>   	
    
   
</div>
</body>
</html>
