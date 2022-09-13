package ch08.sec03;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		//정적 필드이기 떄문에 객체 생성할 필요 x
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(RemoteControl.MIN_VOLUME);
		
		//상수이기 떄문에 필드값을 바꿀 수 없음 (읽기만 가능!)
//		RemoteControl.MAX_VOLUME = 20; //컴파일 에러
	}

}
