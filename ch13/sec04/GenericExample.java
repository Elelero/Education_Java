package ch13.sec04;

public class GenericExample {

	//제너릭 메소드_제한된 타입 파라미터
	public static <T extends Number> boolean compare(T t1, T t2) {
		//T 타입 출력
		System.out.print("compare(" + t1.getClass().getSimpleName() + ", " );
		System.out.println(t2.getClass().getSimpleName() + ")");
		//Number의 메소드 사용
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		//리턴값
		return (v1==v2);
	}
	
	
	public static void main(String[] args) {
		//제너릭 메소드 호출_Integer
		boolean result1 = compare(8, 10);
		System.out.println(result1 + "\n");
		
		//제너릭 메소드 호출_Double
		boolean result2 = compare(4.5, 4.5);
		System.out.println(result2);
	}

}
