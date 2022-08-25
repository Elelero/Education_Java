package ch04.CheckProblem;

public class CheckProblem5 {

	public static void main(String[] args) {
		
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if( (4*x)+(5*y) == 60 ) {
				System.out.println("x는 "+ x + ", y는 " + y);
				}
			}
		}	
	}
}
