package codingTest;

import java.util.Scanner;

public class Problem06 {
	public static void main(String[] args) {
		
		//스캐너 선언 및 입력
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		
		//문자타입 변수 선언
		char text; //loveyou 출력
		
		//정수타입 변수 선언
		int charNum; //
		
		//반복문
		for(int i=0; i<inputStr.length(); i++) {
			charNum =  inputStr.charAt(i);
			if(charNum + 4 > 'z') { //문자형 정수가 z이상일 경우
				text = (char) (charNum + 4 - 26); // 'z' - 26 = 'a'
			} else { //문자형 정수가 z이하일 경우
				text = (char) (charNum + 4);
			}
			System.out.print(text);
		}
		
	}			
}
