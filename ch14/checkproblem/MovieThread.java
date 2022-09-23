package ch14.checkproblem;

public class MovieThread extends Thread {
	
/*	//문제2번
	@Override
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.println("동영상을 재생합니다");
		}
		//예외 처리
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) { }
	}
*/

	//문제6번
	@Override
	public void run() {
		while(true) {
			System.out.println("동영상을 재생합니다.");
			if(isInterrupted()) {
				break;
			}
		}
	}
}
