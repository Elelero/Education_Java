package ch08.sec08;

import ch08.sec07.RemoteControl;
import ch08.sec07.SmartTelevision;

public class MultiInterfaceImplExample {

	public static void main(String[] args) {
		//RemoteControl 객체 생성
		RemoteControl rc = new SmartTelevision();
		rc.turnOn();
		rc.turnOff();
		
		//Searchable 인터페이스 변수 선언 및 구현 객체 대입
		Searchable sr = new SmartTelevision();
		sr.search("https://youtube.com");
	}

}
