package ch09.sec02.exam01;

public class A {
	//인스턴스 멤버 클래스
	  //필드(Field)
	  int field;
	  B field2;
	  //생성자(Constructor)
	  A(){
		  B b = new B();
		  b.methodB();
	  }
	  //메소드(Method)
	  void methodA() {
		  B b = new B();
		  b.methodB();
	  }
	  //중첩 클래스(Nested Class)
	  public class B {
		//필드(Field)
		//생성자(Constructor)
		//메소드(Method)
		void methodB() {
			System.out.println("methodB() 실행");
		}
		
	}
	
}
