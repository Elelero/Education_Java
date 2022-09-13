package ch08.sec05;

public interface RemoteControl {
	//필드 선언
	public static final int MAX_VOLUME = 10; //최대볼륨
	int MIN_VOLUME = 0; //최소볼륨

	//추상 메소드 선언 (실행부 없음)
	void turnOn(); //전원 켜기
	void turnOff();  //전원 끄기
	void setVolume(int volume); //볼륨조절
	int getVolume();
	
	//디폴트 메소드
	default void setMute(boolean mute) { //무음모드
		if(mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
}
