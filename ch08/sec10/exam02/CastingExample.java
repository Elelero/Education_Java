package ch08.sec10.exam02;

public class CastingExample {

	public static void main(String[] args) {
		//인터페이스 변수 선언과 구현 객체 대입
		Vehicle vh = new Bus();
		
		//인터페이스를 통해 호출
		vh.run();
//		vh.checkFare(); 컴파일 에러
		
		//강제 타입 변환 후 메소드 호출
		Bus bus = (Bus) vh;
		bus.run();
		bus.checkFare();
		
		
	}

}
