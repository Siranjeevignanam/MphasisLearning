<%@page import="project.model.Question"%>
<%@page import="project.dao.QuestionDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Questions list</title>
</head>
<body>
<%
    List<Question> qns = (List<Question>) request.getAttribute("questions");
    if (qns != null) {
        for (Question q : qns) {
%>

<table>

<tr>
    <td><%= q.getQuestion() %></td>
    <td><%= q.getOption_a() %></td>
    <td><%= q.getOption_b() %></td>
    <td><%= q.getOption_c() %></td>
    <td><%= q.getOption_d() %></td>
    <td><%= q.getAnswer() %></td>
</tr>

<%
        }
    }
%>

</table>
</body>
</html>