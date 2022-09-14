package ch09.sec02.exam01;

public class AExample {

	public static void main(String[] args) {
		
//		A.B b = new A.B(); //컴파일 에러
		
		A a = new A(); //먼저 A 객체를 생성 후,
//		a.field = 10;
		
		A.B b = a.new B(); //중첩B 객체를 이와같이 생성해야함
		b.methodB();
		
	}

}
