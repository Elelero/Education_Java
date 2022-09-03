package ch06.sec08.exam01;

public class CalculatorExamplePractice {

	public static void main(String[] args) {

		CalculatorPractice cal = new CalculatorPractice();
		
		//#1. squared 메소드 호출&출력
		long result1 = cal.squared(2, 4);
		System.out.println(result1+"\n");
		
		//#2. factorial 메소드 호출&출력
		long result2 = cal.factorial(3);
		System.out.println(result2+"\n");
		
		//#3. remainer 메소드 호출&출력
//		cal.remainer();
		
		//#4. randomNum 메소드 호출&출력
		int result3 = cal.randomNum(2, 5);
		System.out.println(result3+"\n");
		
		
	}

}
