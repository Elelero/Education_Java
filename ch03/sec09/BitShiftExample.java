package ch03.sec09;

public class BitShiftExample {

	public static void main(String[] args) {
		int num1 = 1;
		int result1 = num1 << 3; //8
		int result2 = num1 * (int) Math.pow(2, 3); // Math.pow(2, 3)은 2^3을 연산하고, double값을 산출
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
	}
}
