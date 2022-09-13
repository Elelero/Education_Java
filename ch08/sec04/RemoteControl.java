package ch08.sec04;

public interface RemoteControl {
	//필드 선언
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0; 

	//추상 메소드 선언 (실행부 없음)
	void turnOn(); //전원 켜기
	void turnOff();  //전원 끄기
	void setVolume(int volume); //볼륨조절
}
