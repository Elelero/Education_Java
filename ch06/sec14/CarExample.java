package ch06.sec14;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		//필드 음수값
		myCar.setSpeed(-50);
		System.out.println("속도는? " + myCar.getSpeed()); //출력할때는 get써야함!
		//필드 양수값
		myCar.setSpeed(60);
		System.out.println("속도는? " + myCar.getSpeed()); //출력할때는 get써야함!
		
		if(!myCar.isStop()) { //자동차가 정지상태가 아니라면...!(스탑시켜라!)
			myCar.setStop(true); //자동차를 멈추게 하겠다!
		}
		System.out.println("속도는? " + myCar.getSpeed());
		
	}

}
