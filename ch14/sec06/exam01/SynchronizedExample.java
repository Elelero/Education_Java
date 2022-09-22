package ch14.sec06.exam01;

public class SynchronizedExample {

	public static void main(String[] args) {
		
		//공유 객체 생성
		Calculator calculator = new Calculator();
		
		//스레드 만들고 공유 객체 내용 실행
		User1Thread user1Thread = new User1Thread();		
		User2Thread user2Thread = new User2Thread();

		//user1 공유 객체 실행
		user1Thread.setCalculator(calculator);
		user1Thread.start();
		//user2 공유 객체 실행
		user2Thread.setCalculator(calculator);
		user2Thread.start();
	
	}

}
