package codingTest;

import java.util.Arrays; //배열 정렬을 위해 쓴 배열 라이브러리
import java.util.Scanner;

public class Problem10 {
	public static void main(String[] args) {
		
	//#문제(Lv01) 문자열 내림차순으로 배치하기
		
	String answer = ""; //주어진 코드
		
	//스캐너
	Scanner sc = new Scanner(System.in); //객체생성
	String s = sc.nextLine();//입력받은 값
		
	//배열
        String[] s_1 = s.split(""); //입력값을 문자열 타입으로 배열화
        Arrays.sort(s_1); //오름차순 정렬
        String[] s_2 = new String[s.length()]; //내림차순을 위해 쓰이는 배열
        
        //내림차순 배열로 만들기 위한 반복문
        for(int i=0; i<s.length(); i++){
                s_2[i] = s_1[(s.length()-1)-i];
        }
        
        //배열을 문자열로 변환하기 위한 반복문
        for(int i=0; i<s_2.length; i++) {
        	answer += s_2[i];
        }
        
        //출력
        System.out.println(answer);		
		
	}
}
