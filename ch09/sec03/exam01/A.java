package ch09.sec03.exam01;

public class A {
	//Nested Class
	static class B {
		void methodB() {
			System.out.println("methodB() 실행");
		}
	}
	
	//Field
	B field1 = new B();
	static B field2 = new B(); //B클래스 선언할 때 static 키워드 必
	
	//Constructor
	A() {
		B field1 = new B();
	}
	
	//Method
	void method1() { //A객체가 있다고 생각
		B field1 = new B();
	}
	static void method() { //A객체가 없다고 생각
		B field1 = new B();
	}

	
}
