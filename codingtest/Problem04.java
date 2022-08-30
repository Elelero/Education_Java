package codingTest;

import java.util.Scanner;

public class Problem04 {
	public static void main(String[] args) {
		
		//스캐너 선언
		Scanner sc = new Scanner(System.in);
		int inputNum = Integer.parseInt(sc.nextLine());
		int endNum = Integer.parseInt(sc.nextLine());
		int multiple = Integer.parseInt(sc.nextLine());
		
		//변수 선언
		int sum = 0;
		
		
		//반복문
		for(int i=0; i<=endNum; i++) {
			if( inputNum<=i && i<=endNum ) {
				if(i%multiple==0) {
					sum += i;
				}
			}
		}
		System.out.println(sum);
		
	}			
}
