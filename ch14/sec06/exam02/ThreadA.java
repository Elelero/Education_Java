package ch14.sec06.exam02;

public class ThreadA extends Thread {
	
	//field
	private WorkObject workObject;
	
	//constructor
	public ThreadA(WorkObject workObject) {
		setName("ThreadA"); //스레드 이름 변경
		this.workObject = workObject;
	}
	
	//method -> overriding
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodA();
		}
	}
}
