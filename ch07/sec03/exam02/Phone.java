package ch07.sec03.exam02;
	
public class Phone {
	//필드 선언
	public String model;
	public String color;
	
	//매개변수를 갖는 생성자 선언
	public Phone(String model, String color) { //이렇게 작성하면 자식클래스에서 에러 발생
		this.model = model;
		this.color = color;
		System.out.println("Phone() 생성자 실행");
	}
}
