package ch16.sec04;

public class LambdaExample {

	public static void main(String[] args) {
		
		//Person 객체 생성
		Person person = new Person();
		
		
		//lambda
		//매개변수가 2개이기때문에 소괄호 생략 불가능
		person.action((x, y) -> {
			double result = x + y;
			return result;
		});

		
		//lambda
		//추상메소드에 리턴값이 있으므로 리턴 키워드 생략 가능!
		person.action((x, y) -> x + y );
		//리턴문 있는 람다식 
		person.action((x, y) -> {return (x + y);} );

		
		//lambda
		//아래의 메소드 호출한 람다식
		person.action((x, y) -> sum(x,y));
		
	}

	//중첩 정적 메소드
	public static double sum(double x, double y) {
		return (x + y);
	}

}
