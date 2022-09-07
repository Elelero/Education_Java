package ch07.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {
		//객체 생성
		Driver driver = new Driver();
		
		//매개값으로 버스 객체 제공하고 driver()메소드 호출
		Bus bus = new Bus();
		driver.drive(bus);
		
		//매개값으로 택시 객체 제공하고 driver()메소드 호출
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		
	}

}
