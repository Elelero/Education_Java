package ch09.checkproblem;

public class ActionExample {

	public static void main(String[] args) {
		//익명 구현 객체 생성
		Action action = new Action() {
			@Override
			public void work() {
				System.out.println("복사 go!");
			}
		};
		
		action.work();
	}

}
