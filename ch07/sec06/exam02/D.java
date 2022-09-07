package ch07.sec06.exam02;

import ch07.sec06.exam01.A;

public class D extends A {
	//생성자 선언
	public D() {
		//생성자 호출
		super();
	}
	
	//메소드 선언
	public void method1() {
		//A 필드값 변경
		this.field = "vaule";
		//A 메소드 호출
		this.method();
	}
	
	//메소드 선언
	public void method2() {
		A a = new A(); //x
		a.field = "vaule"; //x
		a.method(); //x
	}
	
	
	
}
