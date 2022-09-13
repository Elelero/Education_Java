package ch08.sec07;

import ch08.sec08.Searchable;

public class SmartTelevision implements RemoteControl, Searchable {

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다");
	}

	@Override
	public void turnOn() {
		System.out.println("TV 전원을 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV 전원을 끕니다.");
	}

}
