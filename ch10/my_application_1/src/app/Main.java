package app;

import pack1.A; //import해서 A 객체를 불러옴!
import pack2.B; //import해서 B 객체 불러옴!

public class Main {

	public static void main(String[] args) {
		
		A a = new A();
		a.method();
		
		B b = new B();
		b.method();
	}

}
