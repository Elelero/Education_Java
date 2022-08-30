package codingTest;

public class Problem05 {
	public static void main(String[] args) {
		
		
		//for 반복문
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int k=4; k>=0; k--) {
			for(int z=k; z>=0; z-- ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}			
}
