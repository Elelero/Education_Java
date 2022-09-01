package ch06.sec06.exam01;

public class CarExample {
	//메인 메소드 생성
	public static void main(String[] args) {
		//Car 객체 생성
		Car myCar = new Car(); //객체 생성을 위해 new 연산자 사용 // 스캐너와 비슷
		
		//메모리에 생성된 객체 안으로 들어가보자!
		//Car 객체의 필드값 읽기
		System.out.println("모델명: " + myCar.model); //null
		System.out.println("시동여부: " + myCar.start); //false
		System.out.println("현재속도: " + myCar.speed); //0
	}

}
