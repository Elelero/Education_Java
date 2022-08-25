package ch04.sec03;

public class SwitchValueExample {

	public static void main(String[] args) {
		char grade = 'B';

		//자바 11 이전 문법
		int score1 = 0;
		switch(grade) {
			case 'A':
				score1 = 100;
				break;
			case 'B':
				int result = 100-20;
				score1 = result;
				break;
			default:
				score1 = 60;
		}
		
		//자바 12 부터 가능
		int score2 = switch(grade) {
		  	case 'A' -> 100;
		  	case 'B' -> {
		  		int result = 100 - 20;
		  		//자바 13 부터 가능
		  		yield result;
		  		}
		  	default -> 60;	
		};
		
		System.out.println("score2: " + score2);
	}
}

