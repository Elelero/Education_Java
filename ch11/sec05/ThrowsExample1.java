package ch11.sec05;

public class ThrowsExample1 {

	public static void main(String[] args) {
		try {
			findClass();
			System.out.println("클래스 맞음");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 틀림");
//			e.printStackTrace();
		}
		
	}

	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
}
