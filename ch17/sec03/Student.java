package ch17.sec03;

public class Student {

	//field
	private String name;
	private int score;
	
	//constructor
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	//method
	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
}
