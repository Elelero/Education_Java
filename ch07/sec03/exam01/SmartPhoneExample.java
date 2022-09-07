package ch07.sec03.exam01;

public class SmartPhoneExample {

	public static void main(String[] args) {
		//SmartPhone 객체 생성
		SmartPhone myPhone = new SmartPhone("아이폰", "노란색"); //이상태에서 실행하면,
															  //Phone() 생성자 실행
															  //SmartPhone() 생성자 실행
		System.out.println(myPhone.model);
		System.out.println(myPhone.color);
	}

}
