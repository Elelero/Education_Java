//강의_예제 실습할 때 형식

public class Practice {

	//interface-----------------------------
	@FunctionalInterface
	public static interface Calculable {
		//abstract method
		void calc();
	}

	
	//Nested Class--------------------------
	class Person {
	}
	
	
	//main method---------------------------
	public static void main(String[] args) {
		Practice p = new Practice();
		Practice.Person person = p.new Person();
	}
	
  
	//static method--------------------------
	public static int method(int x, int y) {
		return (x+y);
	}
}

