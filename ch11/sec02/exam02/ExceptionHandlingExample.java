package ch11.sec02.exam02;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String"); //(일반 예외)코드를 사용하려면 try-catch-finally 작성해야함!
			System.out.println("주어진 클래스는 있습니다.");
		} catch(ClassNotFoundException e) { //예외처리 정보를 출력하자
			System.out.println("주어진 클래스는 없습니다.");
		}

		System.out.println();
		
		try {
			Class.forName("java.lang.String2");
			System.out.println("주어진 클래스는 있습니다.");
		} catch(ClassNotFoundException e) {
			System.out.println("주어진 클래스는 없습니다.");
		}
		
	}

}
