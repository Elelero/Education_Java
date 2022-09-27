package ch16.sec05.exam02;

public class MethodReferenceExample {

	public static void main(String[] args) {
	
		//Person 객체 생성
		Person person = new Person();
		
		//method 호출
		person.ordering((a, b)->{
			return a.compareToIgnoreCase(b);
		});
		person.ordering((a, b)-> a.compareToIgnoreCase(b));
		//메소드 참조 (String 클래스에 속해있는 인스턴스 메소드)
		person.ordering(String :: compareToIgnoreCase);

		
		
		
	}

}
