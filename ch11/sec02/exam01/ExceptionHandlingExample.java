package ch11.sec02.exam01;

public class ExceptionHandlingExample {
	
	//정적 메소드 추가
	public static void printLength(String data) {
		int result = data.length();
		System.out.println("문자수: "+ result);
	}

	public static void main(String[] args) {
		System.out.println("[프로그램 시작!]\n");
		printLength("ThisIsJava");
		printLength(null); //NullPointerException 발생 & 아래 코드 실행x
		System.out.println("\n[프로그램 종료]");
	}

}
