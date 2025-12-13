<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Question</title>
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

    form {
        background-color: #fff;
        padding: 20px 30px;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0,0,0,0.1);
        width: 350px;
    }

    h2 {
        text-align: center;
        margin-bottom: 20px;
    }

    label {
        display: block;
        margin-top: 10px;
        font-weight: bold;
    }

    input[type="text"] {
        width: 100%;
        padding: 8px;
        margin-top: 5px;
        border: 1px solid #ccc;
        border-radius: 4px;
    }

    button {
        width: 100%;
        padding: 10px;
        margin-top: 15px;
        background-color: #28a745;
        color: white;
        border: none;
        border-radius: 4px;
        font-size: 16px;
        cursor: pointer;
    }

    button:hover {
        background-color: #218838;
    }
</style>
</head>
<body>
    <form method="post" action="createQuestion">
        <h2>Add New Question</h2>
        
        <label for="q">Question</label>
        <input type="text" id="q" name="q" required>

        <label for="o1">Option 1</label>
        <input type="text" id="o1" name="o1" required>

        <label for="o2">Option 2</label>
        <input type="text" id="o2" name="o2" required>

        <label for="o3">Option 3</label>
        <input type="text" id="o3" name="o3" required>

        <label for="o4">Option 4</label>
        <input type="text" id="o4" name="o4" required>

        <label for="ans">Answer</label>
        <input type="text" id="ans" name="ans" required>

        <button type="submit">Save</button>
    </form>
</body>
</html>
