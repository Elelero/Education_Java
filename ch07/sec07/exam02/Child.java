package ch07.sec07.exam02;

public class Child extends Parent {
	//메소드 오버라이딩(재정의)
	@Override
	public void method2() {
		System.out.println("Child-Method2");
	}
	
	public void method3() {
		System.out.println("Child-Method3");
	}
}
