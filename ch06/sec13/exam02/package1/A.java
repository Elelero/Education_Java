package ch06.sec13.exam02.package1;

public class A {
	//필드 선언
	A a1 = new A(true);
	A a2 = new A(1); //괄호안에 매개값을 넣어서 사용하려면 생성자를 생성해야함!
	A a3 = new A("문자열");
	
	//생성자 선언
	public A(boolean b) {} //생성자를 먼저 선언해야 위의
	A(int b) {}	   		   //매개변수가 들어간 필드를
	private A(String s) {} //사용할 수 있음
	
	
}
