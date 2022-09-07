package ch07.sec05.exam02;

public class SportCar extends Car {

		//메소드 오버라이딩
		@Override
		public void speedUp() {
			speed += 10;
		}

		//오버라이딩을 할 수 없음
//		@Override
//		public void stop() { //final 메소드이기 때문에 재정의 불가능
//			
//		}
}
