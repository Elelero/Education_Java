package ch03.sec05;

import java.util.Scanner;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		
		//스캐너 사용해보자!
		Scanner scn = new Scanner(System.in);
		
		System.out.print("x: ");
		int x = Integer.parseInt(scn.nextLine());
		
		System.out.print("y: ");
		double y = Double.parseDouble(scn.nextLine());
		
/*		double z = x / y;
		System.out.println("z: " + z); // Infinity
		System.out.println("z + 2: " + (z+2)); //Infinity
*/
		
/*		double z = x % y;
		System.out.println("z: " + z); //NaN
		System.out.println("z + 2: " + (z+2)); //NaN
*/		
		double z = x / y;
		
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		} else {
			System.out.println("z: " + z);
			System.out.println("z + 2: " + (z+2));
		}
		
//		int result = 5 / 0;			//정수연산에서는 실행에러 발생
//		double result = 5 / 0.0;	//실수연산에서는 에러 발생하지 않음 (정상실행 -> 그래서 문제 발생ㄷ)
	}
}
