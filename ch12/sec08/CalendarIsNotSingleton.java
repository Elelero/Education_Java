package ch12.sec08;

import java.util.Calendar;

public class CalendarIsNotSingleton {

	public static void main(String[] args) {
		//Canlendar 객체는 싱글톤일까?
		Calendar clr1 = Calendar.getInstance();
		Calendar clr2 = Calendar.getInstance();
		//false: 싱글톤x | true: 싱글톤o
		System.out.println(clr1.equals(clr2)); //false
	}

}
