package ch08.sec09;

public class ExtendsExample {

	public static void main(String[] args) {
		
		//인터페이스 타입 변수 선언 및 객체 대입
		InterfaceCImpl impl = new InterfaceCImpl();
		
		//InterfaceA 구현 객체 생성
		InterfaceA ia = impl;
		ia.methodA();
//		ia.methodB(); //컴파일 에러
		System.out.println();
		
		//InterfaceB 구현 객체 생성
		InterfaceB ib = impl;
		ib.methodB();
//		ib.methodA(); //컴파일 에러
		System.out.println();
		
		//InterfaceC 구현 객체 생성
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}
}
