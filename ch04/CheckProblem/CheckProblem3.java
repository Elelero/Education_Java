package ch04.CheckProblem;

public class CheckProblem3 {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		
		for( i=1; i<=100; i++) {
			if(i % 3 == 0) {
				sum += i; //i는 1~100값이 들어가는데, i값을 3으로 나누었을 때 0의 값이 나오는것이 3의 배수를 의미하기떄문에 sum 은 3의 배수 총합
			}
		}
		System.out.println(sum);
	}
}
