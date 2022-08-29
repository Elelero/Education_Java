package codingtest;

import java.util.Scanner;

public class Problem03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String b[] = a.split(",");
		int c[] = new int[3];
		String zero = null;
		int count = 0;
		int arr[] = new int[10];
		
		for(int i=0;i<b.length;i++) {
			c[i] = Integer.parseInt(b[i]);
		}
		
		
		zero = String.valueOf(c[0] * c[1] * c[2]);
		String index[] = zero.split("");
		
		for(int i=0; i<index.length; i++) {
			int d[] = new int[index.length];
			d[i] = Integer.parseInt(index[i]);
			for(int j=0; j<10; j++) {
				if(d[i] == j) {
					arr[j] += 1;
				}
			}
			
		}
		for(int i=0; i<10; i++) {
			System.out.println(arr[i]);
		}
	}
}
