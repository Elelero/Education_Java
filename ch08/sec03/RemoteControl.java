package ch08.sec03;

public interface RemoteControl {
	
	//상수필드 선언 (상수는 단일값이기 때문에 선언과 동시에 초기화해줌!)
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0; //public static final이 붙지 않아도 디폴트값으로 생성되어 상수를 의미!
}
