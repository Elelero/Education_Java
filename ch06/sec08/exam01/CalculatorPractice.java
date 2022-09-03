package ch06.sec08.exam01;

import java.util.Scanner;

public class CalculatorPractice {
	
	//#1. 제곱 메소드 선언
	long answer1 = 1; //return할 변수 선언&초기화
	long squared(int x, int y) {
		for(int i=0; i<y; i++) {
			answer1 *= x;
		}
		return answer1;
	}
	
	//#2. 팩토리얼 메소드 선언
	long answer2 = 1; //return할 변수 선언&초기화
	long factorial(int n) {
		for(int i=1; i<=n; i++) {
			answer2 *= i;
		}
		return answer2;
	}
	
	//#3. (실수타입)나머지 메소드 선언 + 스캐너 이용
	double answer3; //return할 변수 선언&초기화
	void remainer() {
		Scanner sc = new Scanner(System.in); //스캐너 객체 선언
		String[] arr = sc.nextLine().split(" ");
		double x = Integer.parseInt(arr[0]);
		int y = Integer.parseInt(arr[1]);
		answer3 = (double) x % y;
		System.out.println(answer3+"\n");
	}
	
	//#4. 임의의 수 뽑기 (시작수 ~ 임의의수개수만큼)
	int answer4;
	int randomNum(int start, int choice) {
		answer4 = (int) (Math.random()*choice)+start;
		return answer4;
	}
	
	
	
}
