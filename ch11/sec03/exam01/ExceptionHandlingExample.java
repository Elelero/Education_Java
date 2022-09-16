package ch11.sec03.exam01;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		
		//배열 생성
		String[] array = {"100", "1oo"};
		
		//for문
		for(int i=0; i<=array.length; i++) {
			try {
				System.out.println(array[i]);
				int value = Integer.parseInt(array[i]);
				
			//다중 catch문을 이용해서 try에서 발생하는 다양한 예외를 처리하자!	
			} catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없는 항목이 있음! 다시 확인 Go!");
			} catch(Exception e) {
				System.out.println("항목수가 부족합니다! 다시 확인 Go!");
			}
		}
	}
}
