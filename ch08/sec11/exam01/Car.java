package ch08.sec11.exam01;

public class Car {
	//필드 정의
	Tire tire1 = new HankookTire();
	Tire tire2 = new HankookTire();
			
	//아래와 같이 선언해도 되지만, 이렇게 선언하게 되면 tire1은 한개밖에 선언 못함		
/*	HankookTire tire1;
	KumhoTire tire2;  */
	
	//메소드 선언
	void run() {
		tire1.roll();
		tire2.roll();
	}
	
	
}
