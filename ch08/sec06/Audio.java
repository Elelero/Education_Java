package ch08.sec06;

public class Audio implements RemoteControl {
	//필드 선언
	private int volume;
	//디폴트메소드 재정의에 쓰이는 추가 필드 선언
	private int memoryVolume;
	
	//인터페이스의 추상 메소드 재정의
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다!");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다!");
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
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}
	
	//디폴트 메소드 재정의
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다.");
//			this.volume = this.memoryVolume; //이렇게 작성해도 되고 아래처럼 작성해도 됨!
			setVolume(this.memoryVolume); //mute가 false일 경우, 원래 볼륨으로 복원하는 코드
		}
	}
	
	@Override
	public int getVolume() {
		return this.volume;
	}
	
}
