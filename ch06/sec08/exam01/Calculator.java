package ch06.sec08.exam01;

import java.util.Scanner;

public class Calculator {
	//리턴값이 없는 메소드 선언
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	//리턴값이 없는 메소드 선언
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	
	//호출 시 두 정수 값을 전달받고,
	//호출한 곳으로 결과값 int를 리턴하는 메소드
	int plus(int x, int y) {
		int result = x + y;
		return result; //리턴값 지정
	}
	
	//호출 시 두 정수값을 전달받고,
	//호출한 곳으로 결과값 double을 리턴하는 메소드 선언
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result; //리턴값 지정
	}
	
	//문제1. 제곱 메소드 작성
	long squared(int x, int y) {
		int result = 1;
		for(int i=0; i<y; i++) {
			result = result*x;
		}
		return result;
	} 
//	long power(int x, int y) { //교수님 풀이
		
//	}
	
	//문제2. 함수(n)를 제공받고 팩토리얼(1x2x3x...xn)의 값을 리턴하는 메소드를 선언
	long factorial(int n) {
		int result = 1;
		for(int i=1; i<=n; i++) {
			result = result*i;
		}
		return result;
	}
	
	//문제3. 두 수를 "키보드"에서 입력받고, 나머지 실수값 메소드 작성
	void remainder() {
		Scanner sc = new Scanner(System.in);
		double x = Double.parseDouble(sc.nextLine()); 
		int y = Integer.parseInt(sc.nextLine()); 
		System.out.print( x % y);
	}
	
	//문제4. 
	int randomNum(int start, int n) {
		int choice = 0;
		choice = (int) ((Math.random()*(n-start+1))+start);
		return choice;
	}
	
}
