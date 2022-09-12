package ch07.checkproblem;

public class Child extends Parent {
	//필드 선언
	public String name;
	
	//생성자 선언
	public Child() {
		this("홍길동");
		System.out.println("Child() 생성자 call");
	}
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) 생성자 call");
	}
}

