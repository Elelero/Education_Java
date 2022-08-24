package ch04.sec03;

public class SwitchExpressionExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		  case 'A', 'a' -> {
			System.out.println("우수회원");
		  }
		  case 'B', 'b' -> {
			System.out.println("일반회원");
		  }
		  default -> {
			System.out.println("손님");
		  }
		}
		
		//중괄호 안에 실행문이 하나만 있을 경우에는 중괄호를 생략할 수 있음!
		switch(grade) {
		  case 'A', 'a' -> System.out.println("우수회원");
		  case 'B', 'b' -> System.out.println("일반회원");
		  default -> System.out.println("손님");
		}
		
	}
}
