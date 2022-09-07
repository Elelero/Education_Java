package ch07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		//SmartPhone 객체 생성
		SmartPhone myPhone = new SmartPhone("갤럭시", "흰색");
		
		
		//Phone으로부터 상속받은 필드 읽기
		System.out.println("모델: " + myPhone.model);
		System.out.println("색상: " + myPhone.color);
		
		
		//SmartPhone 필드 읽기
		System.out.println("와이파이 상태: "+ myPhone.wifi);
		
		
		//Phone으로 부터 상속받은 메소드 호출
		myPhone.bell(); //전화옴
		myPhone.sendVoice("여보세용~");
		myPhone.receiveVoice("안녕 나는 ㅇㅇㅇ이얌!");
		myPhone.sendVoice("아 ㅎㅇㅎㅇ");
		myPhone.receiveVoice("잠만 일생겨서.. 다시 전화걸게!");
		myPhone.hangUp(); //전화끊음
		
		
		//SmartPhone의 메소드 호출
		myPhone.setWifi(true);
		myPhone.internet();
		
	}

}
