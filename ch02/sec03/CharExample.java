package ch02.sec03;

public class CharExample {
	public static void main(String[] args) {
		char c1 = 'A';		//문자 저장
		char c2 = 65;		//유니코드 직접 저장
		
		char c3 = '가';		//문자 저장
		char c4 = 44032;	//유니코드 직접 저장
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		/*char c5 = '가나'; // char 타입도 정수타입의 일종이기에, 한글자만 허용 (두 글자 이상은 컴파일 에러)
		System.out.println(c5);*/
	}

}
