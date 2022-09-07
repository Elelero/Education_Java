package ch07.sec04.exam01;

public class ComputerExample {

	public static void main(String[] args) {
		//변수 선언
		int r = 10;
		
		//Calculator 객체 생성
		Calculator calculator = new Calculator();
		System.out.println(calculator.areaCircle(r));
		
		//Computer 객체 생성
		Computer computer = new Computer();
		System.out.println(computer.areaCircle(r));
		
	}

}
