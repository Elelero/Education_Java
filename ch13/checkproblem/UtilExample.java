package ch13.checkproblem;

public class UtilExample {

	public static void main(String[] args) {
		
		//제너릭타입 객체 생성
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age);
		
		ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원", 20);
		Integer childAge = Util.getValue(childPair, "홍삼순");
		System.out.println(childAge);
		
	}

}
