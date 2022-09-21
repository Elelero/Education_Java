package ch14.sec03.exam03;

//Thread의 자식클래스
//그래서 클래스명 쓰레드 들어감!
public class PrintThread extends Thread {
	@Override
	public void run() {
		for(int i=0; i<5; i++) { //소리 5번 반복
			System.out.println("띵");
			try { //예외 처리해줘야함
				Thread.sleep(500); //소리의 텀을 주기 위한 메소드 (괄호 안 밀리세컨 500=0.5sec)
			} catch (InterruptedException e) {
				//내용 아무것도 놓지 않음 => 예외처리했다는 의미!
			} 
		}
	}
}
