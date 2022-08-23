package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x값 입력: ");
		String strX = scanner.nextLine(); //입력 전까지 대기
		int x = Integer.parseInt(strX);
//		System.out.println(x);

		System.out.print("y값 입력: ");
		String strY = scanner.nextLine(); //입력 전까지 대기
		int y = Integer.parseInt(strY);
//		System.out.println(y);
		
		int result = x + y;
		System.out.println("x + y: " + result);
		
		while(true) {
			System.out.print("입력 문자열: ");
			String data = scanner.nextLine(); //입력 전까지 대기
			if(data.equals("q")) {
				break;
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		
		System.out.println("종료");
		
	}
}
