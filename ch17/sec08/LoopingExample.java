package ch17.sec08;

import java.util.Arrays;

public class LoopingExample {

	public static void main(String[] args) {

		int[] intArr = {1, 2, 3, 4, 5};
		
		//잘못 작성한 경우
		Arrays.stream(intArr)
			.filter(a -> a%2==0)
			.peek(n -> System.out.println(n)); //최종 처리가 없으므로 동작x (결과값 출력x)
		
		
		// 중간 처리 메소드 peek()을 이용해서 반복처리
		int total = Arrays.stream(intArr)
				.filter(a -> a%2==0)
				.peek(n -> System.out.println(n)) //동작o (아래에 최종처리를 해주는 메소드 있음)
				.sum();
		System.out.println("총합: " + total + "\n");
		
		
		//최종 처리 메소드 forEach()를 이용해서 반복 처리
		Arrays.stream(intArr)
		.filter(a -> a%2==0)
		.forEach(n -> System.out.println(n)); //최종 처리이므로 동작함
		
	}

}
