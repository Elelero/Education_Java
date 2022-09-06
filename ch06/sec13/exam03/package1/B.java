package ch06.sec13.exam03.package1;

public class B {
	//메소드 선언
	public void method() {
		A a = new A(); //A 클래스가 public & 생성자 역시 public
		
		//필드값 변경
		a.field1 = 2;
		a.field2 = 6;
//		a.field3 //애초에 보이지도 않음(숨김처리됨)
		
		//메소드 호출
		a.method1();//o 표식(public)
		a.method2();//△ 표식(default)ㅏ
//		a.method3() //보이지 않음(private)
	}

}
