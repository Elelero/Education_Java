package ch08.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		//인터페이스 타입 변수 선언
//		RemoteControl rc;
		//인터페이스 타입 변수 초기화
//		rc = null; //작성해도 되고 안해도 됨!
		//인터페이스 타입 변수 선언 & 초기화 (동시 가능)
//		RemoteControl rc = null;
		
		//변수에 구현 객체 선언
//		rc = new Television();
		
		//한번에 인터페이스 타입의 변수 rc에 객체 대입
		RemoteControl rc = new Television();
		//인터페이스를 통해서 Television 객체를 사용하겠다로 해석!
		
		//인터페이스를 통해서 turnOn 메소드 호출
		rc.turnOn();
		
		//인터페이스를 통해 Audio 객체를 선언
		rc = new Audio();
		rc.turnOn();
		
	}

}
