package ch09.checkproblem;

public class AnonymousExample {

	public static void main(String[] args) {
		
		//객체 생성
		Anonymous an = new Anonymous();
		
		//필드 호출
		an.field.run();
		//메소드 호출
		an.method1();
		an.method2(new Vehicle() {
			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");
			}
		});
		
	}

}
