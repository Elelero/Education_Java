package ch06.sec14;

public class Car {
	//필드 선언
	private int speed;
	private boolean stop;
	
	//Getter와 Setter
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
//			return; //꼭 쓸 필요는 없음!
		} else {
			this.speed = speed;
		}
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) this.speed = 0;
	}
	
	//
}
