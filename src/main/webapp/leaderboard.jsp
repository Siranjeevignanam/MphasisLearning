<%@ page import="java.util.*, project.model.QuizResult" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Leaderboard</title>
<style>
body { font-family: Arial, sans-serif; background-color: #f4f6f9; }
.container { width: 70%; margin: 40px auto; background: #fff; padding: 20px; border-radius: 8px; }
h2 { text-align: center; }
table { width: 100%; border-collapse: collapse; margin-top: 20px; }
th, td { border: 1px solid #ccc; padding: 8px; text-align: center; }
th { background-color: #eee; }
tr:nth-child(even) { background-color: #f9f9f9; }
</style>
</head>
<body>
<div class="container">
    <h2>Leaderboard for Quiz <%= request.getAttribute("quizId") %></h2>
    <%
        List<QuizResult> leaderboard = (List<QuizResult>) request.getAttribute("leaderboard");
        if (leaderboard == null || leaderboard.isEmpty()) {
    %>
        <p>No results yet.</p>
    <%
        } else {
            int rank = 1;
    %>
        <table>
            <tr><th>Rank</th><th>User ID</th><th>Score</th></tr>
            <% for (QuizResult r : leaderboard) { %>
                <tr>
                    <td><%= rank++ %></td>
                    <td><%= r.getUserId() %></td>
                    
                    <td><%= r.getScore() %></td>
                    
                </tr>
            <% } %>
        </table>
    <% } %>
</div>
</body>
</html>
