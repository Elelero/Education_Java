
package ch07.sec07.exam02;

public class ChildExample {

	public static void main(String[] args) {
		
		//자식 객체 생성
		Child child = new Child();
		
		//자동타입 변환
		Parent parent = child;
		
		//메소드 호출
		parent.method1();
		parent.method2(); //재정의(오버라이딩)된 메소드가 호출됨
//		parent.method3(); //컴파일 에러(자식이 부모타입이 될 순 없음)
	}

}
