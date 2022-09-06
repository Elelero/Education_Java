package ch06.sec10.exam02;

public class Television {
	//필드 선언
	static String company = "My Company";
	static String model = "LCD";
	static String info; //정적블록을 사용하기 위해서 선언!
	
	//정적 블록1
	static {
		System.out.println("1");
		info = "정보: " + company;
		info += "-" + model;
	}
	//정적 블록2
	static {
		System.out.println("2");
		
	}
	
}
