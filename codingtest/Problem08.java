package codingTest;

import java.util.Scanner;

public class Problem08 {
	public static void main(String[] args) {
		
		//스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		//스캐너 메소드 선언
		String inputNum = sc.nextLine(); //암기할 수 있는 목록개수 & 단어개수
		String inputWord = sc.nextLine(); //입력받은 단어들
		
		//배열 선언
		String[] arrNum = inputNum.split(" "); //개수 배열에 저장
		String[] arrWord = inputWord.split(" "); //단어 목록
		String[] remember = new String[Integer.parseInt(arrNum[1])]; //암기 목록
		
		//변수 선언
		int time = 0;
		int N = Integer.parseInt(arrNum[0]); //3
		int W = Integer.parseInt(arrNum[1]); //10
		
		for(String word : arrWord ) {
			for(int i=0; i<N; i++) {
				if(remember[i]==null || !remember[i].equals(word)) {
					remember[i] = word;
					time += 3;
				} else if(remember[i].equals(word)) {
					time += 1;
				}
					
				}
				
			}
			System.out.println(time);
		}
}
