package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) throws Exception {
		
		Scanner scn = new Scanner(System.in); //scanner 생성
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("-------------------");
			System.out.println("1. 증가 | 2. 감소 | 3. 중지");
			System.out.println("-------------------");
			System.out.print("선택: ");
			
			String strNum = scn.nextLine();
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재속도 = " + speed + " 증가↑");
			} else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재속도 = " + speed + " 감소↓");
			} else if(strNum.equals("3")) {
				run = false;
			}
			
		}
		
		System.out.println("프로그램 종료");
		
	}
}
