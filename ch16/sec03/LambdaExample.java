package ch16.sec03;

public class LambdaExample {

	public static void main(String[] args) {
		
		//Person 객체 생성
		Person person = new Person();
		
		//람다식 action1
		//매개변수의 개수가 중요함(이름은 똑같이 할 필요 없음)
		person.action1((name, job)->{
			System.out.print(name + "이 ");
			System.out.println(job + "을 합니다.");
		});

		//람다식 action2
		//매개변수 개수 중요! 이름은 임의로 적어도 노상관!
		//매개변수가 한개일 경우 소괄호 생략 가능!
		person.action2(word -> {
			System.out.print("\"" + word + "\"");
			System.out.println("라고 말합니다.");
		});
		
		//람다식 action1
		//실행문 1개 -> 중괄호 생략 가능!
		person.action1((name, job) -> System.out.println(name + "이 "+ job + "을 마칩니다."));

	}

}
