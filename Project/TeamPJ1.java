package TeamPJ;

import java.util.Scanner;

public class TeamPJ1 {

	public static void main(String[] args) {
		

		//변수선언
		Scanner scanner = new Scanner(System.in); //스캐너 객체
		String[][] boards = new String[100][4]; // 배열 선언 & 생성
		int number;
		int seq = 0; //페이지
		int price=0;
		int sum=0;
		
		System.out.println("---------------------------");
		System.out.println("-------물품 관리 게시판-------");
		System.out.println("---------------------------");
		
			
		while(true) {
			
			System.out.println();
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("1. 등록 | 2. 제품목록조회 |  3. 제품 할인 가격 | 4. 제품 가격의 총합| 5. 종료");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.print("선택> ");
			number = Integer.parseInt(scanner.nextLine());
			
				if(number == 1) { 
						System.out.print("제품명을 입력하세요!-> ");
						boards[seq][0] = scanner.nextLine();
						System.out.print("가격을 입력하세요!-> ");
						boards[seq][1] = scanner.nextLine();
						System.out.print("종류(전자/문구/식품/가구)를 입력하세요!->");
						boards[seq][2] = scanner.nextLine();
						System.out.print("제품상태(상/중/하) ");
						boards[seq][3] = scanner.nextLine();
						++seq; //현재페이지에 작성하고 나서 다음페이지로 넘김
					}  else if (number ==2) { 
						System.out.print("조회할 제품 종류(전자/문구/식품/가구)를 입력하세요😊: ");
						String k = scanner.nextLine();
						for(int i=0; i<seq; i++) {
								if( k.equals("전자") ) {
									System.out.print(boards[i][0] + " ");
									System.out.print(boards[i][1] + " ");
									System.out.print(boards[i][2] + " ");
									System.out.println(boards[i][3] + " ");
								} else if(k.equals("문구")) {
									System.out.print(boards[i][0] + " ");
									System.out.print(boards[i][1] + " ");
									System.out.print(boards[i][2] + " ");
									System.out.println(boards[i][3] + " ");
								} else if(k.equals("식품")) {
									System.out.print(boards[i][0] + " ");
									System.out.print(boards[i][1] + " ");
									System.out.print(boards[i][2] + " ");
									System.out.println(boards[i][3] + " ");
								} else if(k.equals("가구")) {
									System.out.print(boards[i][0] + " ");
									System.out.print(boards[i][1] + " ");
									System.out.print(boards[i][2] + " ");
									System.out.println(boards[i][3] + " ");
								}
							}
					
		}  else if (number == 3) {
			System.out.print("할인할 제품 종류(전자/문구/식품/가구) 선택: ");
			String t = scanner.nextLine();
		
			int i =0;
				if (t.equals("전자")) {
					for(i=0; i<seq; i++) {
						int originPrice = Integer.parseInt(boards[i][1]);
						System.out.print(boards[i][0] + " ");
						System.out.println(boards[i][1] + " ");
						System.out.print("할인율 입력 : ");
						int percentage = Integer.parseInt(scanner.nextLine());
						System.out.print("할인된 가격: ");
						double x = (double) ( 1- (percentage / 100.0) )*(originPrice);
						System.out.println(x);
						System.out.println("---------------------");
					}} else if (t.equals("문구")) {
						int originPrice = Integer.parseInt(boards[i][1]);
						System.out.print(boards[i][0] + " ");
						System.out.println(boards[i][1] + " ");
						System.out.print("할인율 입력 : ");
						int percentage = Integer.parseInt(scanner.nextLine());
						System.out.println("-------할인된 가격-------");
						double x = (double) ( 1- (percentage / 100.0) )*(originPrice);
						System.out.println(x);
					} else if (t.equals("식품")) {
						int originPrice = Integer.parseInt(boards[i][1]);
						System.out.print(boards[i][0] + " ");
						System.out.println(boards[i][1] + " ");
						System.out.print("할인율 입력 : ");
						int percentage = Integer.parseInt(scanner.nextLine());
						System.out.println("-------할인된 가격-------");
						double x = (double) ( 1- (percentage / 100.0) )*(originPrice);
						System.out.println(x);
					} else if (t.equals("가구")) {
						int originPrice = Integer.parseInt(boards[i][1]);
						System.out.print(boards[i][0] + " ");
						System.out.println(boards[i][1] + " ");
						System.out.print("할인율 입력 : ");
						int percentage = Integer.parseInt(scanner.nextLine());
						System.out.println("-------할인된 가격-------");
						double x = (double) ( 1- (percentage / 100.0) )*(originPrice);
						System.out.println(x);
					}
		} else if (number == 4) {
					for(int i=0; i<seq; i++) {
					price = Integer.parseInt(boards[i][1]);
					sum+=price; 
				}System.out.println(sum);
		}else if (number == 5) {
			System.out.println("종료합니다!");
		}
		
		} 
		
}
}	

			

		
		
		

