package ch07.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
//		Phone phone = new Phone(); 추상클래스이기 때문에 객체 생성 불가능
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn(); //Phone 메소드
		smartPhone.internetSearch();
		smartPhone.turnOff(); //Phone 메소드
		
	}

}
