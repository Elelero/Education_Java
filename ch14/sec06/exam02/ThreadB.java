package ch14.sec06.exam02;

public class ThreadB extends Thread {
	
	//field
	private WorkObject workObject;
	
	//constructor
	public ThreadB(WorkObject workObject) {
		setName("ThreadB"); //스레드 이름 변경
		this.workObject = workObject;
	}
	
	//method -> overriding
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodB();
		}
	}
}
