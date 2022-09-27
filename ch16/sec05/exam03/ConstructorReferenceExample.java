package ch16.sec05.exam03;

public class ConstructorReferenceExample {

	public static void main(String[] args) {
		
		//Person 객체 생성
		Person person = new Person();
		
		//----------------------------------------
		//랃다식을 이용하여 인터페이스 익명구현객체 대입 및 생성
		Member m1 = person.getMember1((id) -> {
			Member m = new Member(id);
			return m;
		});
		//매개변수1개, 리턴값 1개 -> 생략
		m1 = person.getMember1(id -> new Member(id));
		//생성자 참조 람다식으로 변환
		m1 = person.getMember1(Member :: new);
		//출력
		System.out.println(m1); //Member(String id) 생성자 실행(3번), {id: winter, name: null}
		
		//----------------------------------------
		//랃다식을 이용하여 인터페이스 익명구현객체 대입 및 생성
		Member m2 = person.getMember2((id, name) -> {
			Member m = new Member(id, name);
			return m;
		});
		//리턴값 1개 -> 생략
		m2 = person.getMember2((id, name) -> new Member(id, name));
		//생성자 참조 람다식으로 변환
		m2 = person.getMember2(Member :: new);
		//출력
		System.out.println(m2); //Member(String id, String name) 생성자 실행(3번), {id: winter, name: 한겨울}
		
	}

}
