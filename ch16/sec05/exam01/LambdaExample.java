package ch16.sec05.exam01;

public class LambdaExample {

	public static void main(String[] args) {
		
		//Person 객체 생성
		Person person = new Person();
		
		
		//lambda - static 메소드 참조
		person.action((x, y) -> {
			// return(x+y);
			return Computer.staticMethod(x, y);
		});
		// 위의 람다식 간편화 (실행문1개-중괄호 생략, 리턴문 삭제)
		person.action((x, y) -> Computer.staticMethod(x, y));
		// 위의 람다식 더욱 간편화 (메소드 참조)
		person.action(Computer :: staticMethod);

		//줄바꿈
		System.out.println("\n");
		
		
		//lambda - instance(인스턴스) 메소드 참조
		//Computer 객체 생성
		Computer com = new Computer();
		person.action((x, y)->{
			return com.instanceMethod(x, y);
		});
		person.action((x, y)->com.instanceMethod(x, y));
		person.action(com :: instanceMethod);
		
	}

}
