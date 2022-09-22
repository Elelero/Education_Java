package ch14.sec07.exam02;

public class PrintThread extends Thread {
	
	@Override
	public void run() {
		while(true) {
			System.out.println("실행 중...");
//			Thread.sleep(1);
			if(Thread.interrupted()) { //이 메소드가 호출되었는가?를 물음
				break; //호출되었으면 반복문 중단;
			}
		}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
}
