package ch07.sec10.exam01;

public abstract class Phone { //추상 클래스
	//필드 선언
	String owner;
	
	//생성자 선언
	Phone(String owner){
		this.owner = owner;
	}
	
	//메소드 선언
	void turnOn() {
		System.out.println("폰 전원 ON");
	}
	
	void turnOff() {
		System.out.println("폰 전원 OFF");
	}
	
}
