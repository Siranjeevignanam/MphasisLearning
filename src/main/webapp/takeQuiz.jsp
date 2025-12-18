<%@ page import="java.util.*, project.model.Question" %>

<%
    List<Question> questions = (List<Question>) request.getAttribute("questions");
    Map<Integer, String> userAnswers =
            (Map<Integer, String>) request.getAttribute("userAnswers");
    Integer score = (Integer) request.getAttribute("score");
    Integer quizIdObj = (Integer) request.getAttribute("quizId");

    int quizId = quizIdObj != null ? quizIdObj : 0;
%>

<!DOCTYPE html>
<html>
<head>
    <title>Take Quiz</title>

    <!-- SIMPLE CSS -->
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
        }

        h2 {
            text-align: center;
        }

        .container {
            width: 70%;
            margin: auto;
            background: white;
            padding: 20px;
            border-radius: 5px;
        }

        .question {
            margin-bottom: 15px;
        }

        label {
            display: block;
            margin-left: 20px;
        }

        button {
            padding: 8px 20px;
            font-size: 16px;
            cursor: pointer;
        }

        .score {
            text-align: center;
            font-size: 18px;
            color: green;
        }
    </style>
</head>

<body>

<h2>Take Quiz</h2>

<div class="container">

<% if (questions == null || questions.isEmpty()) { %>

    <p>No questions available.</p>

<% } else { %>

    <form action="takeQuiz" method="post">
        <input type="hidden" name="quizId" value="<%= quizId %>">

        <%
            int i = 1;
            for (Question q : questions) {
                String selected =
                        userAnswers != null ? userAnswers.get(q.getId()) : null;
        %>

        <div class="question">
            <p><b><%= i++ %>. <%= q.getQuestion() %></b></p>

            <label>
                <input type="radio" name="q<%= q.getId() %>" value="A"
                    <%= "A".equals(selected) ? "checked" : "" %> >
                <%= q.getOption_a() %>
            </label>

            <label>
                <input type="radio" name="q<%= q.getId() %>" value="B"
                    <%= "B".equals(selected) ? "checked" : "" %> >
                <%= q.getOption_b() %>
            </label>

            <label>
                <input type="radio" name="q<%= q.getId() %>" value="C"
                    <%= "C".equals(selected) ? "checked" : "" %> >
                <%= q.getOption_c() %>
            </label>

            <label>
                <input type="radio" name="q<%= q.getId() %>" value="D"
                    <%= "D".equals(selected) ? "checked" : "" %> >
                <%= q.getOption_d() %>
            </label>
        </div>

        <hr>

        <% } %>

        <center>
            <button type="submit">Submit Quiz</button>
        </center><br>
    </form>
    <form action="quizList">
     <center>
            <button type="submit" class="button" >Back</button>
        </center>
    </form>
    

    <% if (score != null) { %>
        <p class="score">
            Your Score: <%= score %> / <%= questions.size() %>
        </p>
    <% } %>

<% } %>

</div>

</body>
</html>
