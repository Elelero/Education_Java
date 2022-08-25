package ch05.sec11;

public class MainStringArrayArgument {

	public static void main(String[] args) {
//		System.out.println(args.length); //String[] args 배열의 값이 없다는 의미; 0
		
		if(args.length != 2) {
			System.out.println("프로그램 입력값이 부족");
			System.exit(0);
		}
		
//		System.out.println("정상종료");
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1); //정수타입으로 변환
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println("result: " + result);
		
	}
}
