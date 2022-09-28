package ch17.sec06.exam01;

import java.util.ArrayList;
import java.util.List;

public class Student {

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
}
