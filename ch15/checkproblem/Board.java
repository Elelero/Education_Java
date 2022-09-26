package ch15.checkproblem;

public class Board {

	//field
	private String title;
	private String content;
	
	//constructor
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}

	//getter method
	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}
	
}
