package ch04.CheckProblem;

public class PracticeEx {

	public static void main(String[] args) {
		
		String grade = "A";
		
		int score1 = 0;
		switch(grade) {
			case "A":
				score1 = 100;
				break;
			case "B":
				int result = 100 - 20;
				score1 = result;
				break;
			default:
				score1 = 60;
				break;
		}
		System.out.println(score1);
		
	}
}
