package ch14.checkproblem;

public class ThreadExample {

	public static void main(String[] args) {

/*		//문제2번
		Thread thread1 = new MovieThread();
		thread1.start();
		
		Thread thread2 = new Thread(new MusicThread());
		thread2.start();
*/
		
/*		//문제6번
		Thread thread = new MovieThread();
		thread.start();
		try {
			thread.sleep(3000);
		} catch (InterruptedException e) { }
		thread.interrupt();
*/
		//문제 8번
		Thread thread = new MovieThread();
		thread.setDaemon(true);
		thread.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) { }
		
	}

}