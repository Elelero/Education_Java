package ch14.sec03.exam02;

//작업2 내용을 갖고 있는 객체
//쓰레드 아님
public class Task implements Runnable {

	@Override
	public void run() {
		//작업2
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
