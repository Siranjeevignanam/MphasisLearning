<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="project.model.Question" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Question</title>
<style>
    body { font-family: Arial, sans-serif; background-color: #f4f6f9; }
    .container {
        width: 400px; margin: 50px auto; background: #fff;
        padding: 20px; border-radius: 8px; box-shadow: 0 4px 12px rgba(0,0,0,0.1);
    }
    label { display: block; margin-top: 10px; font-weight: bold; }
    input[type="text"] { width: 100%; padding: 8px; margin-top: 5px; }
    button {
        margin-top: 15px; padding: 10px; width: 100%;
        background-color: #28a745; color: white; border: none; border-radius: 4px;
    }
    button:hover { background-color: #218838; }
</style>
</head>
<body>
<div class="container">
    <h2>Edit Question</h2>
    <%
        Question q = (Question) request.getAttribute("question");
    %>
    <form action="editQuestion" method="post">
        <input type="hidden" name="id" value="<%= q.getId() %>">

        <label>Question</label>
        <input type="text" name="question" value="<%= q.getQuestion() %>">

        <label>Option A</label>
        <input type="text" name="option_a" value="<%= q.getOption_a() %>">

        <label>Option B</label>
        <input type="text" name="option_b" value="<%= q.getOption_b() %>">

        <label>Option C</label>
        <input type="text" name="option_c" value="<%= q.getOption_c() %>">

        <label>Option D</label>
        <input type="text" name="option_d" value="<%= q.getOption_d() %>">

        <label>Answer</label>
        <input type="text" name="answer" value="<%= q.getAnswer() %>">

        <button type="submit">Update</button>
    </form>
</div>
</body>
</html>
