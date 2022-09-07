package ch07.sec07.exam01;

class A {
	
}

class B extends A {
	
}

class C extends A {
	
}

class D extends B {
	
}

class E extends C {
	
}

public class PromotionExample {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//상속관계o(대분류)
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		//상속관계o(중분류)
		B b1 = d;
		C c2 = e;
		
		//상속관계x(소분류)
//		B b2 = e; //x
//		C c2 = d; //x
		
	}
}
