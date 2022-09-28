package ch17.sec07.exam01;

public class Student implements Comparable<Student>{

	//field
	private String name;
	private int score;
	
	//constructor
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	//getter method
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
	//method overriding
	@Override
	public int compareTo(Student o) {
		return Integer.compare(score, o.score);
	}
	
	
}
