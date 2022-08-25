package ch04.sec02;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큼");
			System.out.println("등급 A");
		}
		
		if(score < 90)
			System.out.println("점수가 90보다 작음");
			System.out.println("등급 B"); // if문과 상관없는 실행문
		
		//위의 코드는 아래와 같음	
		if(score < 90) {
			System.out.println("점수가 90보다 작음");
		}
		System.out.println("등급 B");
		
	}
}
