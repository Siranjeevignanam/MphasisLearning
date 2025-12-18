package project.model;

public class QuizResult {
    private int id;
    private int quizId;
    private int userId;
    private int score;

    public QuizResult() {}

    public QuizResult(int quizId, int userId, int score) {
        this.quizId = quizId;
        this.userId = userId;
        this.score = score;
    }

    // getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getQuizId() { return quizId; }
    public void setQuizId(int quizId) { this.quizId = quizId; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }
}
