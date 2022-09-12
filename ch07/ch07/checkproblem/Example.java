package ch07.checkproblem;

public class Example {

	//action()메소드 선언
	public static void action(A a) {
		a.method1();
		if(a instanceof C c) { //instanceof 연산자 사용!
			c.method2();
		}
	}
	
	//main 메소드 
	public static void main(String[] args) {
		action(new A());
		action(new B());
		action(new C());
	}

}



