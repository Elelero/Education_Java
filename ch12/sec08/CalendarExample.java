package ch12.sec08;

import java.util.*;

public class CalendarExample {
	public static void main(String[] args) {
		//Calendar는 추상클래스 -> 객체 생성 불가능
		//getInstance를 이용해 자식객체 불러옴 
		Calendar now = Calendar.getInstance();
		
		//날짜 구하기
		int year = now.get(Calendar.YEAR);                
		int month = now.get(Calendar.MONTH) + 1;          
		int day = now.get(Calendar.DAY_OF_MONTH);     
		int week = now.get(Calendar.DAY_OF_WEEK);  
//		System.out.println(week);
		//요일 구하기
		String strWeek = null;
		switch(week) { //week 대신 year, month, day를 넣어도 값은 동일!
			case Calendar.MONDAY: 		strWeek = "월"; 	break;
			case Calendar.TUESDAY: 		strWeek = "화"; break;
			case Calendar.WEDNESDAY: 	strWeek = "수"; break;
			case Calendar.THURSDAY: 	strWeek = "목"; break;
			case Calendar.FRIDAY: 		strWeek = "금"; break;
			case Calendar.SATURDAY: 	strWeek = "토"; break;
			default: 					strWeek = "일";
		}
		
		//오전,오후 구하기
		int amPm  = now.get(Calendar.AM_PM);
		System.out.println(amPm);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		//시간 구하기
		int hour    = now.get(Calendar.HOUR);                 
		int minute  = now.get(Calendar.MINUTE);             
		int second  = now.get(Calendar.SECOND);              
		
		//오늘 연월일&시간 출력
		//연월일
		System.out.print(year + "년 " + month + "월 " + day + "일 " + strWeek + "요일 ");
		//시간
		System.out.println(strAmPm + " " + hour + "시 " + minute + "분 " + second + "초 입니다!");
	}
}


