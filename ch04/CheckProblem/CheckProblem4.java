package ch04.CheckProblem;

public class CheckProblem4 {

	public static void main(String[] args) {
		int sum = 0;
		
		while(true) {
			int num1 = (int)(Math.random()*6) + 1;
			int num2 = (int)(Math.random()*6) + 1;
			System.out.println("(" + num1 + ", " + num2 + ")");
//			System.out.printf("(%d,%d)", num1, num2)
			
			sum = num1 + num2;
			if(sum == 5) {
				System.out.println("두개의 주사위 값의 합이 5이므로 종료합니다!");
				break;
			}
		}
	}
}
