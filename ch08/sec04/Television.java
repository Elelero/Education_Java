package ch08.sec04;

public class Television implements RemoteControl {
	//필드 선언
	private int volume;
	
	//인터페이스의 추상 메소드 재정의
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다!");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다!");
	}

	@Override
	public void setVolume(int volume) { //무결성을 해치지 않고 올바른 값을 가공하기 위한 것이 setter
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume; //매개변수로 들어온 값으로 초기화!
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
}
