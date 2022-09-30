package ch17.sec12.exam01;

public class Student {

	//field
	private String name;
	private String sex;
	private int score;
	
	//constructor
	public Student(String name, String sex, int score) {
		this.name = name;
		this.sex = sex;
		this.score = score;
	}
	
	//method (getter)
	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public int getScore() {
		return score;
	}
	
}
