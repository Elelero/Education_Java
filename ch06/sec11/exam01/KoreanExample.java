package ch06.sec11.exam01;

public class KoreanExample {

	public static void main(String[] args) {
		//객체 생성시 주민등록번호와 이름 전달
		Korean k1 = new Korean("123456-1234567", "김자바");
		
		//필드값 읽기(출력)
		System.out.println("국가: " + k1.nation);
		System.out.println("주민등록번호: " + k1.ssn);
		System.out.println("이름: " + k1.name);
		
		//final 필드는 값을 변경할 수 없음!
//		k1.nation = "미국"; //컴파일 에러
//		k1.ssn = "789456-1234567"; //컴파일 에러
		
		//final 필드가 아닌 필드는 변경할 수 있음!
		k1.name = "이자바"; 
		System.out.println("바꾼이름: " + k1.name);
		
	}

}
