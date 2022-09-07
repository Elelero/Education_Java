package ch07.sec04.exam01;

public class Computer extends Calculator { 
//	//메소드 오버라이딩(재정의)
//	@Override //어노레이션(Anotation) -> 실수 방지
//	public double areaCircle(double r) { //접근 제한자 잘 보기!
//		System.out.println("Computer 객체의 areaCircle()을 실행");
//		return Math.PI * r * r;
//	}
	
	
	//쉽게 재정의하는 방법은..?
	//ctrl + space
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle()을 실행");
//		return super.areaCircle(r);
		return Math.PI * r * r;
	}
	
}
