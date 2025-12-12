<%@page import="project.model.Question"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="createquestion.jsp">
  <button type="button">Add question</button>
</a><br>



  <form action="QuestionListServlet" method="get">
    <button type="submit">List Questions</button>
</form>



</body>
</html>  