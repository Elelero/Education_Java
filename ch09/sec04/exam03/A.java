package ch09.sec04.exam03;

public class A {
	
	//메소드 선언
	public void method1(int arg) {
		//변수 선언
		int var = 1;
		
		//로컬 클래스
		class B {
			//로컬 클래스_메소드
			void method2() {
				System.out.println("arg: " + arg); //아래의 arg=2와 var=2 때문에 오류 발생
				System.out.println("var: " + var);
			}
			
		}
		
//		arg = 2; //위치는 외부 내부 상관없음! 수정불가임!
//		var = 2;
		B b = new B();
		b.method2();
		
		System.out.println("(change) arg: "+ arg); //2
		System.out.println("(change) var: "+ var); //2
		
		
	}
	
	
	//main 메소드 선언
	public static void main(String[] args) {
		A a = new A();
		a.method1(3);
	}
	
}
