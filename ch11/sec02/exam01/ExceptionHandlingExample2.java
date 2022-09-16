package ch11.sec02.exam01;

public class ExceptionHandlingExample2 {
	
	//정적 메소드 추가
	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("문자수: "+ result);
		} catch(NullPointerException e) {
			//예외 정보를 얻는 3가지 방법(메소드)
//			System.out.println(e.getMessage());//예외사유
//			System.out.println(e.toString()); //예외종류+예외사유
			e.printStackTrace();//예외를 추적
		} finally {
			System.out.println("[마무리 실행]");
		}
	}

	//main 메소드
	public static void main(String[] args) {
		System.out.println("[프로그램 시작!]\n");
		printLength("ThisIsJava");
		printLength(null); //NullPointerException 발생 & 아래 코드 실행x
		System.out.println("\n[프로그램 종료]");
	}

}
