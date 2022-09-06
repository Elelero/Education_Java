package ch06.sec13.exam03.package1;

public class A {
	//필드 선언
	public int field1;
	int field2;
	private int field3;
	
	//메소드 선언
	public void method1() {	}
	void method2() { }
	private void method3() { }
	
	//생성자 선언
	public A() { //컴파일 에러 발생 No!
		field1 = 1;
		field2 = 5;
		field3 = 10;
		
		method1();
		method2();
		method3();
	}
}
