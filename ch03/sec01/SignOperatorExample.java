package ch03.sec01;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x = -100;
		x = -x;
		System.out.println("x: " + x);
		
		byte b = 100;
		int y = -b;	//변수타입을 byte로 하면 컴파일 에러 (int로 지정해줘야함)
		System.out.println("y: " + y);
	}
}
