package ch04.sec08;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) { // 2로 나누었을 때 0이 나오지 않는 수는 출력하지 않고 바로 다음 숫자로 넘김
				continue;
			}
			System.out.print(i + " ");
		}
	}
}
