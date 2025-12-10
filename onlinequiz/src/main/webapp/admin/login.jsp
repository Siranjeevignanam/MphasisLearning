<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
</head>
<body>
<form action="/AdminServlet" method="post">
    <label for="username">Username</label>
    <input type="text" id="username" name="name" placeholder="Enter your username" required>

    <label for="password">Password</label>
    <input type="password" id="password" name="password" placeholder="Enter your password" required>

    <button type="submit">Login</button>
</form>

</body>
</html>