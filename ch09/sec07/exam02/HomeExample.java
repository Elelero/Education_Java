package ch09.sec07.exam02;

public class HomeExample {

	public static void main(String[] args) {
		
		//Home 객체 생성
		Home home = new Home();
		
		home.use1();
		home.use2();
		home.use3(new RemoteControl() { //익명구현객체 선언 후 바로 호출
			@Override
			public void turnOn() {
				System.out.println("난방 전원 ON");
			}
			@Override
			public void turnOff() {
				System.out.println("난방 전원 OFF");
			}
		});

		
		
	}

}
