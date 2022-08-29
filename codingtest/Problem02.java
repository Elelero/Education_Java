package codingtest;

import java.util.Scanner;

public class Problem02 {
	
	public static void main(String[] args) {
		
		// 스캐너 선언
		Scanner scn = new Scanner(System.in);
		String num = scn.nextLine();
		// 배열 선언
		int[] arr = new int[7]; //홀수값을 저장해줄 배열
		String[] arr1 = num.split(","); //입력값 ,을 기준으로 분리하여 배열로 만듬
		// 변수 선언
		int sum = 0; //총합
		int min = 0; //최소값
		
		//홀수일 때, 총합과 최소값을 구하는 반복문&조건문 실행
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(arr1[i]);
			if(arr[i]%2 == 1) {
				sum += arr[i];
				if(min==0) { //한번밖에 실행안됨
					min = arr[i];
				} else if(min>arr[i]) { 
					min = arr[i];
				}
			} 
		}
		//짝수일 때 실행되는 조건문
		if(sum == 0) {
			System.out.println("-1");
		} else { //홀수일때 출력!
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
