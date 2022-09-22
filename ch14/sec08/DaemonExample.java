package ch14.sec08;

public class DaemonExample {

	public static void main(String[] args) {
		
		AutoSaveThread thread = new AutoSaveThread();
		thread.setDaemon(true);
		thread.start();
		
		try { //메인스레드 3초간 잠시 정지
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		} 
		
		thread.interrupt();
		System.out.println("메인 스레드 종료");
	}

}
