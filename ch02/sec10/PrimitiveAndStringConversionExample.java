package ch02.sec10;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		//큰따옴표 안에 숫자 = 문자타입
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
		//큰따옴표 안에 있는 숫자가 아니라 그냥 숫자임 = 정수타입
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
	}

}
