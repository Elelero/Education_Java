package ch14.checkproblem;

public class MusicThread extends Thread {
	@Override
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.println("음악을 재생합니다");
		}
		//예외 처리
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
	}
}
