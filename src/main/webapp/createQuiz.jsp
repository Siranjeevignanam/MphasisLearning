<%@ page import="java.util.List" %>
<%@ page import="project.model.Question" %>
<%@ page import="project.dao.QuestionDao" %>
<%
    QuestionDao dao = new QuestionDao();
    List<Question> qns = dao.getQuestions();
%>
<!DOCTYPE html>
<html>
<head>
<title>Select Questions</title>
</head>
<body>
<h2>Create Quiz</h2>
<form action="createQuiz" method="post">
    <label>Quiz Title:</label>
    <input type="text" name="title" required><br><br>

    <table border="1">
        <tr>
            <th>Select</th>
            <th>Question</th>
            <th>Answer</th>
        </tr>
        <%
            for (Question q : qns) {
        %>
        <tr>
            <td><input type="checkbox" name="questionIds" value="<%= q.getId() %>"></td>
            <td><%= q.getQuestion() %></td>
            <td><%= q.getAnswer() %></td>
        </tr>
        <%
            }
        %>
    </table>
    <br>
    <button type="submit">Create Quiz</button>
</form>
</body>
</html>
