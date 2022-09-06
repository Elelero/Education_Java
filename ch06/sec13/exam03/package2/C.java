package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.A;

public class C {
	//메소드 선언
	public C() {
		A a = new A(); //A 클래스가 public & 생성자 역시 public
		
		//필드값 변경
		a.field1 = 2;
//		a.field2 //얘도 패키지가 다르기때문에 보이지 않음(default)
//		a.field3 //애초에 보이지도 않음(숨김처리됨)
		
		//메소드 호출
		a.method1();//o 표식(public)
//		a.method2();//안보임^^(default)
//		a.method3() //보이지 않음(private)
	}
	
}
