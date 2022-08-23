package ch03.sec04;

public class AccuracyExample1 {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int num = 7;
		
		double result = apple - pieceUnit*num;
		System.out.println("사과 1개에서 남은 양: " + result); //0.3이 나와야하지만 실제로는 0.2999가 나옴
	}
}
