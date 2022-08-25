package ch04.CheckProblem;

import java.util.Scanner;

public class CheckProblem7_2 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int bank = 0;  //잔고
		int money = 0; //예금,출금액
		
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택> ");
			
			int num = scn.nextInt();
			
			if(num==1) {
				System.out.print("예금액> ");
				money = scn.nextInt();
				bank += money;
			} else if(num==2) {
				System.out.print("출금액> ");
				money =scn.nextInt();
				bank -= money;
			} else if(num==3) {
				System.out.println("잔고> " + bank); //print로 입력하면 계속 안됨! println으로 해야함
			} else if(num==4) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}

/*			switch(num) {
				case 1:
					System.out.print("예금액> ");
					money = scn.nextInt();
					bank += money;
					break;
				case 2:
					System.out.print("출금액> ");
					money = scn.nextInt();
					bank -= money;
					break;
				case 3:
					System.out.print("잔고> " + bank);
					break;
				case 4:
					run = false;
					break;
			}
 */