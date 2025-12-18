<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Dashboard</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f6f9;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .container {
        background: #fff;
        padding: 30px 40px;
        border-radius: 10px;
        box-shadow: 0 4px 12px rgba(0,0,0,0.1);
        text-align: center;
        width: 350px;
    }

    h1 {
        margin-bottom: 20px;
        color: #333;
    }

    a, form {
        display: block;
        margin: 15px 0;
    }

    button {
        width: 100%;
        padding: 12px;
        background-color: #007bff;
        color: white;
        border: none;
        border-radius: 6px;
        font-size: 16px;
        cursor: pointer;
        transition: background-color 0.3s ease;
    }

    button:hover {
        background-color: #0056b3;
    }

    .logout-btn {
        background-color: red;
    }
    .logout-btn:hover {
        background-color: #a71d2a;
    }

    .quiz-btn {
        background-color: #17a2b8;
    }
    .quiz-btn:hover {
        background-color: #117a8b;
    }
</style>
</head>
<body>
<div class="container">
    <h1>Admin Panel</h1>

    <a href="createquestion.jsp">
      <button type="button">Add Question</button>
    </a>

    <form action="QuestionListServlet" method="get">
        <button type="submit">List Questions</button>
    </form>

    <a href="updateServlet">
        <button type="button">Update Questions</button>
    </a>

    <!-- New Create Quiz button -->
    <a href="createQuiz.jsp">
        <button type="button" >Create Quiz</button>
    </a>

<a href="quizList">
        <button type="button">List available quizzes</button>
    </a>
    <form action="LogoutServlet" method="get">
        <button type="submit" class="logout-btn">Logout</button>
    </form>
</div>
</body>
</html>
