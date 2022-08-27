package project.ArrayScannerTeamPJ;

import java.util.Scanner;

public class TeamPJ1 {

	public static void main(String[] args) {
		

		//변수선언
		Scanner sc = new Scanner(System.in); //스캐너 객체
		String[][] boards = new String[100][4]; // 배열 선언 & 생성
		int number;
		int seq = 0; //페이지
		int price=0;
		int sum=0;
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("-----------------------| 상품 관리 게시판 |-------------------------");
		System.out.println("----------------------------------------------------------------");
		
			
		while(true) {
			
			System.out.println();
			System.out.println("                          <<메뉴판>> ");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println(" 1.등록 | 2.상품 목록 조회 |  3.상품 할인가 | 4.등록한 상품의 총가격 | 5.종료 ");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.print("선택-> ");
			
			number = Integer.parseInt(sc.nextLine());
			
				// 1.등록 창
				if(number == 1) {
						System.out.print("상품명을 입력하세요!-> ");
						boards[seq][0] = sc.nextLine();
						System.out.print("가격을 입력하세요!-> ");
						boards[seq][1] = sc.nextLine();
						System.out.print("종류(전자/문구/식품/가구)를 입력하세요!->");
						boards[seq][2] = sc.nextLine();
						System.out.print("상품상태(상/중/하)-> ");
						boards[seq][3] = sc.nextLine();
						System.out.println("\n[상품 등록이 완료되었습니다!!]");
						++seq; //현재배열에 위의 입력값을 저장 후, 다음 배열로 넘김
						
				// 2.종류별로 등록한 상품 목록 조회	창
				}  else if (number ==2) { 
						System.out.print("조회할 상품 종류(전자/문구/식품/가구)를 입력하세요😊-> ");
						String k = sc.nextLine();
						
						for(int i=0; i<seq; i++) {
							if( boards[i][2].equals(k) ) {
								System.out.print("상품명: " + boards[i][0] + " | ");
								System.out.print("가격: " + boards[i][1] + " | ");
								System.out.print("종류: " + boards[i][2] + " | ");
								System.out.println("상품상태: " + boards[i][3] + " | ");
								} 
							}
				
				//3. 종류별로 등록한 상품에 할인가 적용		
				}  else if (number == 3) {
						System.out.print("할인할 상품 종류(전자/문구/식품/가구)를 입력하세요😊-> ");
						String k = sc.nextLine();

						for(int i=0; i<seq; i++) {
							if (k.equals("전자")) {
								if(boards[i][2].equals("전자")) {
									int originPrice = Integer.parseInt(boards[i][1]);
									System.out.println("상품명: " + boards[i][0] + " | 가격: " + boards[i][1] + " ");
									System.out.print("할인율 입력-> ");
									int percentage = Integer.parseInt(sc.nextLine());
									double x = (double) ( 1- (percentage / 100.0) )*(originPrice);
									System.out.println("[할인된 가격: " + (int) x + "원]\n");
								}
							} else if (k.equals("문구")) {
								if(boards[i][2].equals("문구")) {
									int originPrice = Integer.parseInt(boards[i][1]);
									System.out.println("상품명: " + boards[i][0] + " | 가격: " + boards[i][1] + " ");
									System.out.print("할인율 입력-> ");
									int percentage = Integer.parseInt(sc.nextLine());
									double x = (double) ( 1- (percentage / 100.0) )*(originPrice);
									System.out.println("[할인된 가격: " + (int) x + "원]\n");
								}
							} else if (k.equals("식품")) {
								if(boards[i][2].equals("식품")) {
									int originPrice = Integer.parseInt(boards[i][1]);
									System.out.println("상품명: " + boards[i][0] + " | 가격: " + boards[i][1] + " ");
									System.out.print("할인율 입력-> ");
									int percentage = Integer.parseInt(sc.nextLine());
									double x = (double) ( 1- (percentage / 100.0) )*(originPrice);
									System.out.println("[할인된 가격: " + (int) x + "원]\n");
								}
							} else if (k.equals("가구")) {
								if(boards[i][2].equals("가구")) {
									int originPrice = Integer.parseInt(boards[i][1]);
									System.out.println("상품명: " + boards[i][0] + " | 가격: " + boards[i][1] + " ");
									System.out.print("할인율 입력-> ");
									int percentage = Integer.parseInt(sc.nextLine());
									double x = (double) ( 1- (percentage / 100.0) )*(originPrice);
									System.out.println("[할인된 가격: " + (int) x + "원]\n");
								}
							}
						}

				//4. 등록한 상품들의 총 가격		
				} else if (number == 4) {
						for(int i=0; i<seq; i++) {
						price = Integer.parseInt(boards[i][1]);
						sum+=price; 
						}
					System.out.println("\n[등록한 상품들의 총 가격은 \"" + sum + "\"원 입니다👍]");

				//5. 상품 관리 게시판 종료	
				}else if (number == 5) {
						System.out.println("\n[상품 관리 게시판을 종료합니다👋]");
						break;
				}
		} 
		
	}
}	

			

		
		
		

