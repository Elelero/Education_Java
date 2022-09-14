package ch09.sec07.exam03;

import ch09.sec07.exam03.Button.ClickListener; //import 해줘야 에러 발생 No!

public class ButtonExample {

	public static void main(String[] args) {
		
		//Button 객체 생성
		Button btnOk = new Button();
		Button btnCancel = new Button();
		
		//Button 객체에 Click Event 처리 객체 선언 & "익명 구현 객체를 만들자!"
		btnOk.setClickListener(new ClickListener() {
			@Override
			public void onClick() {
				System.out.println("Ok 버튼 클릭!");
			}
		});
		btnCancel.setClickListener(new ClickListener() {
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼 클릭!");
				
			}
		});
		
		//Button이 클릭 되었을 때
		btnOk.click();
		btnCancel.click();
		
	}

}
