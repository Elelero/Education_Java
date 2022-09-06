package ch06.sec15;

public class Singleton {
	//private 접근 권한을 갖는 '정적 필드' 선언과 초기화
	private static Singleton singleton = new Singleton();
	
	//private 접근 권한을 갖는 '생성자' 선언
	private Singleton() { }
	
	//public 접근 권한을 갖는 '정적 메소드' 선언
	public static Singleton getInstance() { //다른패키지에서도 사용하기 위해서는
		return singleton;					//public 접근 제한자 설정해줘야함
	}
}
