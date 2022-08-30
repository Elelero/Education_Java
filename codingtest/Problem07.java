package codingTest;

import java.util.Scanner;

public class Problem07 {
	public static void main(String[] args) {
		
		//스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		//스캐너 메소드 선언
		int apple = Integer.parseInt(sc.nextLine()); //사과의 개수
		String scores = sc.nextLine(); // 사과에 쓰인 점수
		String obstacle1 = sc.nextLine(); // 장애물1
		String obstacle2 = sc.nextLine(); // 장애물2
		
		//배열
		String[] arrScores1 = scores.split(" "); //문자열타입으로 입력받은 사과의 점수를 배열로 나타냄
		String[] arrObstacle1 = obstacle1.split(""); //문자열타입으로 입력받은 장애물XO을 배열로 나타냄
		String[] arrObstacle2 = obstacle2.split(""); //문자열타입으로 입력받은 장애물XO을 배열로 나타냄

		//변수
		int sum =0; //얻은 점수 총합
		
		//반복문
		for(int i=0; i<apple; i++) {
			if(arrObstacle1[i].equals("O") && arrObstacle2[i].equals("O")) {
				sum += Integer.parseInt(arrScores1[i]);
			} 
		}

		System.out.println("총점수는" + sum + "입니다");
		
	}			
}
