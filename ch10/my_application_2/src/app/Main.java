package app;

import pack1.A;    
//import pack2.B;
import pack3.C;

public class Main {

	public static void main(String[] args) {
		
		A a = new A();
		a.method();
		
//		B b = new B(); //pack2-B 은닉했기 때문에 사용不
//		b.method();
		
		//전이의존
		C c = new C();
		c.method();
		
		C result = a.getC();
		result.method();
		
	}

}

