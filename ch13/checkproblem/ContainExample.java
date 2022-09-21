package ch13.checkproblem;

public class ContainExample {

	public static void main(String[] args) {
		
		//제너릭타입_String 객체 생성
		Container<String> container1 = new Container<String>();
		container1.set("홍길동");
		String str = container1.get();

		//제너릭타입_Integer 객체 생성
		Container<Integer> container2 = new Container<Integer>();
		container2.set(6);
		int value = container2.get();
		
		//출력
		System.out.println("str: " + str);
		System.out.println("value: " + value);
		
	}

}
