package ch06.sec08.exam04;

public class CalculatorExample {

	public static void main(String[] args) {
		//객체 생성
		Calculator myCalc = new Calculator();
		
		//정사각형 넓이 구하기
		double result1 = myCalc.areaRectangle(5);
		
		//직사각형 넓이 구하기
		double result2 = myCalc.areaRctangle(10, 5);
		
		System.out.println("정사각형 넓이는 " + result1 + "입니당");
		System.out.println("직사각형 넓이는 " + result2 + "입니당");
	}

}
