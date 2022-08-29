package codingtest;

import java.util.Scanner;

public class Problem03_1 {
	
	public static void main(String[] args) {
		
		//스캐너 선언
		Scanner scn = new Scanner(System.in);
		String num = scn.nextLine();
		//배열 선언
		int[] array = new int[10];
		String[] array1 = num.split(","); //num의 값들을 ,기준으로 분리하여 배열에 저장	
		//변수 선언
		int a = Integer.parseInt(array1[0]);
		int b = Integer.parseInt(array1[1]);
		int c = Integer.parseInt(array1[2]);
		String abc = String.valueOf(a*b*c);
		
//		System.out.println(abc);
		int i = 0;
		int j = 0;
		
		//for문 반복
			for(j=0; j<10; j++) {
				String k = String.valueOf(j);
				if(abc.contains(k)) {
					array[j] = abc.length()-abc.replace(k, "").length();
				} else if(!abc.contains(k)) {
					array[j] = 0;
				}
			}
		for(i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
