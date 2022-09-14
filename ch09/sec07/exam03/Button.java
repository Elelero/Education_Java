package ch09.sec07.exam03;

public class Button {
	//Field
	private ClickListener clickListener; //인스턴스 필드 선언
	//Constructor
	//Method
	public void setClickListener(ClickListener clickListener) { //setter
		this.clickListener = clickListener; //필드에 값을 저장하기 위해 this 이용
	}
	public void click() {
		clickListener.onClick();
	}
	//Nested Class
	//Nested Interface
	public static interface ClickListener{
		public void onClick(); //추상 메소드
		
	}
}
