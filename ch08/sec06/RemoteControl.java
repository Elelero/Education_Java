package ch08.sec06;

public interface RemoteControl {
	//필드 선언
	public static final int MAX_VOLUME = 10; //최대볼륨
	int MIN_VOLUME = 0; //최소볼륨

	//추상 메소드 선언 (실행부 없음) -> 구현객체 있어야함
	void turnOn(); //전원 켜기
	void turnOff();  //전원 끄기
	void setVolume(int volume); //볼륨조절
	int getVolume();
	
	//디폴트 메소드 -> 구현객체 있어야함
	default void setMute(boolean mute) { //무음모드
		if(mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메소드 -> 인터페이스 소속임(객체 필요x)
	static void changeBattery() { //public 안붙여도 기본값이 public임
		System.out.println("리모콘 건전지를 교환합니다.");
	}
	
	
	
}
