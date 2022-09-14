package ch09.sec07.exam02;

public class Home {
	//Field
	private RemoteControl rc = new RemoteControl() { //익명 구현객체 대입
		//추상메소드 재정의
		@Override
		public void turnOn() {
			System.out.println("TV 전원 ON");
		}
		@Override
		public void turnOff() {
			System.out.println("TV 전원 OFF");
		}
	};
	
	//Constructor
	
	//Method
	public void use1() {
		rc.turnOn();  //구현객체의 turnOn 실행
		rc.turnOff(); //구현객체의 turnOff 실행
	}
	public void use2() {
		//변수 선언 -> 익명구현객체 만듬
		RemoteControl rc = new RemoteControl() {
			//재정의
			@Override
			public void turnOn() {
				System.out.println("에어컨 전원 ON");
			}
			@Override
			public void turnOff() {
				System.out.println("에어컨 전원 OFF");
			}
		};
		rc.turnOn();  //바로 위의 구현객체의 turnOn 실행
		rc.turnOff(); //바로 위의 구현객체의 turnOff 실행
	}
	public void use3(RemoteControl rc) { //매개변수이용
		rc.turnOn();
		rc.turnOff();
	}
	
	
}
