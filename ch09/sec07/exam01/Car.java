package ch09.sec07.exam01;

public class Car {
	//필드 선언
	private Tire tire1 = new Tire();
	private Tire tire2 = new Tire() {
		//재정의(오버라이딩)
		@Override
		public void roll() {
			System.out.println("익명 자식 Tire 객체1 roll!");
		}
	}; //중괄호를 붙이는 순간 완전히 다른 뜻! = 익명 자식 객체
	
	//run1()메소드 선언 -> 익명자식객체 필드 호출
	public void run1() {
		tire1.roll();
		tire2.roll(); //재정의(오버라이딩)된 자식객체 호출됨
	}
	
	//run2()메소드 선언 -> 메소드 안에 익명자식객체선언
	public void run2() {
		//익명 자식 객체 선언
		Tire tire = new Tire() {
			//재정의(오버라이딩)
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체2 roll!");
			}
		};
		tire.roll(); //재정의(오버라이딩)된 자식객체 호출됨
	}
	
	//run3()메소드 선언 -> 매개변수를 이용해서 자식객체 호출
	public void run3(Tire tire) {
		tire.roll();
	}
	
}
