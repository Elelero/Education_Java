package ch14.sec02;

public class MainThreadExample {

	public static void main(String[] args) {
		
		System.out.println("시작");
		
		//스레드 객체 생성 (정적 메소드 실행)
		Thread currThread = Thread.currentThread();
		System.out.println(currThread.getName()); //main
		
		
		System.out.println("종료");
		
	}

}

//Thread currThread = null; // 이코드 작성하면 아래에서 예외 발생