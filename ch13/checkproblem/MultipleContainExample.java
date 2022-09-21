package ch13.checkproblem;

public class MultipleContainExample {

	public static void main(String[] args) {

		//제너릭 타입 객체 생성
		MultipleContainer<String, String> container1 = new MultipleContainer<String, String>();
		container1.set("홍길동", "도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		System.out.println(name1 + "의 직업은 " + job + "이다!");
		
		//제너릭 타입 객체 생성
		MultipleContainer<String, Integer> container2 = new MultipleContainer<String, Integer>();
		container2.set("홍길동", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
		System.out.println(name1 + "의 나이는 " + age + "이다!");
		
		
		
	}

}
