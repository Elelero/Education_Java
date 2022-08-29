package codingtest;

import java.util.Scanner;

public class Problem01 {
	
	public static void main(String[] args) {
		
		System.out.print("반복할 숫자를 입력하세요-> ");
		Scanner scn = new Scanner(System.in);
		
		int num = Integer.parseInt(scn.nextLine());
		
		for(int i=0; i<num; i++) {
			String x = "Hello MyCompany";
			System.out.println(x);
		}
	}
}
