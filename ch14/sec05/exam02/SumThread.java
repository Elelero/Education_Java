package ch14.sec05.exam02;

public class SumThread extends Thread {
	private long sum;

	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}
	
	
	//Thread 클래스 - run() 재정의
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			sum += i;
		}
	}
	
	
}
