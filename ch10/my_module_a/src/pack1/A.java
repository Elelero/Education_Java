package pack1;

import pack2.B;
import pack3.C; //추가된 라이브러리

public class A {
	//Field
	//Constructor
	//Method
	public void method() {
		System.out.println("A-method 실행");
		//B클래스 사용
		B b = new B(); //public이기 때문에 사용 가능!
		b.method();
	}
	public C getC() { //my_module_b 모듈의 pack3.C 타입 리턴
		C c = new C();
		return c;
	}
}

