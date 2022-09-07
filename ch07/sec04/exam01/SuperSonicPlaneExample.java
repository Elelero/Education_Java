package ch07.sec04.exam01;

public class SuperSonicPlaneExample {

	public static void main(String[] args) {
		//SuperSonicAirplane 객체 생성
		SuperSonicAirplane superS = new SuperSonicAirplane();
		
		//메소드 호출
		superS.takeOff();
		superS.fly();
		superS.flyMode = SuperSonicAirplane.SUPERSONIC;
		superS.fly();
		superS.flyMode = SuperSonicAirplane.NOMAL;
		superS.fly();
		superS.land();
		
	}

}
