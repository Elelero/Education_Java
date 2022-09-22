package ch14.sec07.exam02;

public class InterruptExample {

	public static void main(String[] args) {
		
		//스레드객체 생성
		Thread thread = new PrintThread();
		//스레드 시작
		thread.start();
		//스레드 일시정지
		try {
			thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		//스레드 일시정지 상태 방해
		thread.interrupt();
	
	}

}
