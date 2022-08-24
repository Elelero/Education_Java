package ch04.CheckProblem;

import java.util.Scanner;

public class CheckProblem7_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean program = true;
		int money = 0;
		
		while (program) {
			
			System.out.println("-----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-----------------------------------");
			System.out.print("선택> ");
			
			int sum = Integer.parseInt(sc.nextLine());
			
			if(sum == 1) {
				System.out.print("예금액> ");
				int p = Integer.parseInt(sc.nextLine());
				money += p;
			} else if(sum == 2) {
				System.out.print("출금액> ");
				int m = Integer.parseInt(sc.nextLine());
				money -= m;
			} else if(sum == 3) {
				System.out.println("잔고> " + money);
			} else if(sum == 4) {
				program = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
