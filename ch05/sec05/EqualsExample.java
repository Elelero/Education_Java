package ch05.sec05;

public class EqualsExample {

	public static void main(String[] args) {
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		if(strVar1 == strVar2) { //번지 비교
			System.out.println("strVar1과 strVar2는 참조가 같음"); //실행
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}

		if(strVar1.equals(strVar2)) { //내부 문자열 비교
			System.out.println("strVar1과 strVar2는 문자열이 같음"); //실행
		}
		
		
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		if(strVar3 == strVar4) { //번지 비교
			System.out.println("strVar3와 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3와 strVar4는 참조가 다름"); //실행
		}
		
		if(strVar3.equals(strVar4)) { //내부 문자열 비교
			System.out.println("strVar3와 strVar4는 문자열이 같음"); //실행
		}
		
		
	}
}
