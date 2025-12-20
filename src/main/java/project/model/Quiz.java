package project.model;

import java.util.List;

public class Quiz {
    private int id;
    private String title;
    @Override
	public String toString() {
		return "Quiz [id=" + id + ", title=" + title + ", questions=" + questions + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	public Quiz(int id, String title, List<Question> questions) {
		super();
		this.id = id;
		this.title = title;
		this.questions = questions;
	}
	private List<Question> questions;

	public Quiz()
	{
		
	}
    // getters and setters
}
