package ch12.sec03.exam01;

public class MemberEqualsExample {

	public static void main(String[] args) {
		//객체 생성
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		//출력
		System.out.println(obj1==obj2); //false -> 객체의 번지가 다름
		System.out.println(obj1.equals(obj2)); // 재정의된 메소드가 실행되어 true 출력
		
		//객체 생성
		Member obj3 = new Member("red");
		//출력
		System.out.println(obj1==obj3); //false -> 객체 번지 다름
		System.out.println(obj1.equals(obj3)); // blue != red -> false
		
		
	}

}
