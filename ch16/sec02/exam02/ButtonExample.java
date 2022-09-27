package ch16.sec02.exam02;

public class ButtonExample {

	public static void main(String[] args) {
		
		//Ok 버튼 객체 생성
		Button btnOk = new Button();
		
		//Ok 버튼 객체에 람다식(ClickListener 익명구현객체) 주입
		//실행문이 하나이기 때문에 중괄호 생략 가능!
		btnOk.setClickListener(()-> System.out.println("Ok 버튼 클릭"));
		
		//Ok 버튼 클릭하기
		btnOk.click();
		
		//Cancel 버튼 객체 생성
		Button btnCancel = new Button();
		
		//Cancel 버튼 객체에 람다식 주입
		//전형적인 람다식 코드
		btnCancel.setClickListener(()->{
			System.out.println("Cancel 버튼 클릭");
		});
		
		//Cancel 버튼 클릭하기
		btnCancel.click();
		
		
	}

}
