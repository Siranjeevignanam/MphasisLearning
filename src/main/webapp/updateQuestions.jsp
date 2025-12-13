<!DOCTYPE html>
<%@page import="project.model.Question"%>
<%@page import="java.util.List"%>
<html>
<head>
<meta charset="UTF-8">
<title>Questions list</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f6f9;
        margin: 0;
        padding: 20px;
    }

    h1 {
        text-align: center;
        color: #333;
        margin-bottom: 20px;
    }

    table {
        width: 90%;
        margin: 0 auto;
        border-collapse: collapse;
        background: #fff;
        box-shadow: 0 4px 12px rgba(0,0,0,0.1);
    }

    th, td {
        padding: 12px 15px;
        text-align: left;
    }

    th {
        background-color: grey;
        color: white;
        font-weight: bold;
    }

    tr:nth-child(even) {
        background-color: #f9f9f9;
    }

    tr:hover {
        background-color: #f1f1f1;
    }

    a {
        text-decoration: none;
        padding: 6px 12px;
        border-radius: 4px;
        font-size: 14px;
        margin-right: 5px;
    }

    a[href*="editQuestion"] {
        background-color: #28a745;
        color: white;
    }

    a[href*="editQuestion"]:hover {
        background-color: #218838;
    }

    a[href*="deleteQuestion"] {
        background-color: #dc3545;
        color: white;
    }

    a[href*="deleteQuestion"]:hover {
        background-color: #c82333;
    }
</style>
</head>
<body>
<h1>Questions List</h1>
<table>
    <tr>
        <th>Question</th>
        <th>Option A</th>
        <th>Option B</th>
        <th>Option C</th>
        <th>Option D</th>
        <th>Answer</th>
        <th>Actions</th>
    </tr>

<%
    List<Question> qns = (List<Question>) request.getAttribute("questions");
    if (qns != null) {
        for (Question q : qns) {
%>
    <tr>
        <td><%= q.getQuestion() %></td>
        <td><%= q.getOption_a() %></td>
        <td><%= q.getOption_b() %></td>
        <td><%= q.getOption_c() %></td>
        <td><%= q.getOption_d() %></td>
        <td><%= q.getAnswer() %></td>
        <td>
            <a href="editQuestion?id=<%= q.getId() %>">Edit</a>
            <a href="deleteQuestion?id=<%= q.getId() %>">Delete</a>
        </td>
    </tr>
<%
        }
    }
%>
</table>
</body>
</html>
