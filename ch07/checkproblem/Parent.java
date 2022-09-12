package ch07.checkproblem;

public class Parent {
	//필드 선언
	public String nation;
	
	//생성자 선언
	public Parent() {
		this("대한민국");
		System.out.println("Parent() 생성자 call");
	}
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) 생성자 call");
	}
}

