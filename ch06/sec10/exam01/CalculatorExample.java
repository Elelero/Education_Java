package ch06.sec10.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		
		//잘못된 코드
		Calculator myCalc = new Calculator();
		double result1 = 10 * 10 * myCalc.pi;
		int result2 = myCalc.plus(4, 10);
		int result3 = myCalc.minus(5, 1);
		
		//올바른 코드
//		double result1 = 10 * 10 * Calculator.pi;
//		int result2 = Calculator.plus(4, 10);
//		int result3 = Calculator.minus(5, 1);
		
		System.out.println("result1: "+ result1);
		System.out.println("result2: "+ result2);
		System.out.println("result3: "+ result3);
	}

}
