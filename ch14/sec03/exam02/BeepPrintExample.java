package ch14.sec03.exam02;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		//작업1 -> 소리를 5번 내는 작업
		//작업스레드의 익명객체 생성
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit(); //소리를 내기 위해서는 Toolkit 객체 필요 (정적 메소드 호출)
				for(int i=0; i<5; i++) { //소리 5번 반복
					toolkit.beep(); //띵! 소리
					try { //예외 처리해줘야함
						Thread.sleep(500); //소리의 텀을 주기 위한 메소드 (괄호 안 밀리세컨 500=0.5sec)
					} catch (InterruptedException e) {
						//내용 아무것도 놓지 않음 => 예외처리했다는 의미!
					} 
				}
			}
		});
		//위에 생성한 객체를 호출하기 위해서는 start()메소드를 사용해야함
		thread.start();
		
		
		//작업2
		/*for(int i=0; i<5; i++) { //소리 5번 반복
			System.out.println("띵");
			try { //예외 처리해줘야함
				Thread.sleep(500); //소리의 텀을 주기 위한 메소드 (괄호 안 밀리세컨 500=0.5sec)
			} catch (InterruptedException e) {
				//내용 아무것도 놓지 않음 => 예외처리했다는 의미!
			} 
		} */
		//작업 내용을 갖고 있는 객체 생성
//		Thread thread2 = new Thread(new Task()); //이 코드 아니면 아래 코드 사용하면됨
		Runnable tk = new Task();
		Thread thread2 = new Thread(tk);
		thread2.start();
		
	}

}
