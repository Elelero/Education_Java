package ch09.checkproblem;

public class Anonymous {
	//필드로 익명구현객체 생성
	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	};
	
	//메소드 안에 익명구현객체 생성
	void method1() {
		Vehicle localVar = new Vehicle() {
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
		localVar.run();
	}
	
	//매개변수를 이용한 익명구현객체 생성
	void method2(Vehicle v) {
		v.run();
	}
	
	
}
