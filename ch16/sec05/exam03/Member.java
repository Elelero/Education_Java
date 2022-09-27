package ch16.sec05.exam03;

public class Member {

	//field
	private String id;
	private String name;
	
	//constructor
	public Member(String id) {
		this.id = id;
		System.out.println("Member(String id) 생성자 실행");
	}
	public Member(String id, String name) { //생성자 오버로딩
		this.id = id;
		this.name = name;
		System.out.println("Member(String id, String name) 생성자 실행");
	}
	
	//method 재정의
	@Override
	public String toString() {
		String info = "{id: " + id + ", name: " + name + "}";
		return info;
	}
}
