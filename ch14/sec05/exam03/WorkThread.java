package ch14.sec05.exam03;

public class WorkThread extends Thread {
	//field
	public boolean work = true;
	
	//constructor
	public WorkThread(String name) {
		setName(name);
	}
	
	//method //재정의
	@Override
	public void run() {
		while(true) {
			if(work) {
				System.out.println(getName() + ": 작업처리!");
			} else {
				Thread.yield();
			}
		}
	}
}
