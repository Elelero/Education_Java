package ch04.CheckProblem;

import java.util.Scanner;

public class CheckProblem7_3 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in); //Scanner 타입의 변수 scn을 선언했음
		boolean run = true; // 불리언타입의 변수 run을 선언하고 true를 저장했음
		int bank = 0;  //int타입의 변수 bank를 선언하고 0을 저장했음 | 잔고를 의미하는 변수
//		int money = 0; //int타입의 변수 money를 선언하고 0을 저장했음 | 예금,출금액을 의미하는 변수
		
		
		while(run) {  //while문에 run이라는 변수를 넣음으로써 true가 되므로 반복문이 실행됨
			// 처음보이는 값을 출력함
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");

			//실행하기 전 멈춰져 있는 대기 상태, 키보드 엔터값 전까지의 값을 저장함
			String choice = scn.nextLine();
			
			if(choice.equals("1")) {
				//if 실행문
				System.out.print("예금액> ");
				int money1 = Integer.parseInt(scn.nextLine());
				bank += money1;
			} else if(choice.equals("2")) {
				System.out.print("출금액> ");
				int money2 = Integer.parseInt(scn.nextLine());
				bank -= money2;
			} else if(choice.equals("3")) {
				System.out.println("잔고는 " + bank + "입니다"); //print로 입력하면 계속 안됨! println으로 해야함
			} else if(choice.equals("4")) {
				run = false;
			}
		}
		System.out.println("종료!");
	}
}


			//다른 방법
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