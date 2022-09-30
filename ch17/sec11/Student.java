package ch17.sec11;

public class Student {

	//field
	private String name;
	private int score;
	
	//constructor
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	//method (getter)
	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
}
