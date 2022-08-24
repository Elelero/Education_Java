package ch04.sec07;

public class BreakOutterExample {

	public static void main(String[] args) {
		
		Outter: for(char upper='A'; upper<='Z'; upper++) { 	//반복문 이름 Outter
			
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + " - " + lower);
				if(lower == 'g') {
					break Outter;	//조건문 성립하면 Outter반복문 멈춤
				}
			}
			
		}
	}
}
