package ch14.sec06.exam01;

public class Calculator {
	//field
	private int memory;
	
	//method -> getter&setter 
	public int getMemory() {
		return memory;
	}
	
	//동기화 메소드
	public synchronized void setMemory1(int memory) { //메소드 전체 동기화
		this.memory = memory;
		//예외처리
		try {
			Thread.sleep(2000);
		} catch (Exception e) {}
		//출력
		System.out.println(Thread.currentThread().getName()+": "+this.memory);
	}
	
	//동기화 블록
	public synchronized void setMemory2(int memory) { //메소드 일부분 동기화
		//...
		synchronized (this) { //동기화 블록 생성
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (Exception e) {}
			System.out.println(Thread.currentThread().getName()+": "+this.memory);
		}
		//...
	}
	
}
