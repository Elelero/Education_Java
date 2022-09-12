package ch07.checkproblem;

public class SnowTireExample {

	public static void main(String[] args) {
		//SnowTire 객체 생성
		SnowTire snowTire = new SnowTire();
		//자동 타입 변환
		Tire tire = snowTire;
		
		//메소드 호출
		snowTire.run();
		tire.run(); //재정의된 메소드가 호출됨
	}

}
