package ch16.sec02.exam01;

public class LambdaExample {

	public static void main(String[] args) {
		//Person 클래스 객체 생성
		Person person = new Person();
		
		//실행문이 두 개 이상인 경우 중괄호 필요!
		person.action(() -> {
			System.out.println("출근 Go");
			System.out.println("프로그래밍 Go");
		});
		
		//실행문이 한 개 일 경우 중괄호 생략
		person.action(()-> System.out.println("퇴근 Go"));
	}

}
