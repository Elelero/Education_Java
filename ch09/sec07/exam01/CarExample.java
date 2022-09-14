package ch09.sec07.exam01;

public class CarExample {

	public static void main(String[] args) {
		
		//변수에 객체 대입
		Car car = new Car();
		//메소드 호출
		car.run1(); 
		car.run2();
		car.run3(new Tire() { //타이어 객체x -> 타이어를 상속한 자식 클래스 객체를 매개값으로 제공
			//재정의(오버라이딩)
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체3 roll!");
			}
		});
		
	}

}
