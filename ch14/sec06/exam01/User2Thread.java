package ch14.sec06.exam01;

public class User2Thread extends Thread {
	//field -> 공유 객체로 사용할 예정
	private Calculator calculator;
	
	//constructor
	public User2Thread() {
		setName("User2Thread"); //이름 바꾸는 메소드
	}
	
	//method
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	//method overriding
	@Override
	public void run() {
		calculator.setMemory2(50);
	}
}
