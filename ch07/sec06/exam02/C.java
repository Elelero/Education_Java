package ch07.sec06.exam02;

import ch07.sec06.exam01.A;

public class C {
	//메소드 선언
	public void method() {
		A a = new A(); //생성 no
		a.field = "vaule"; //x
		a.method(); //x 
	}
}
