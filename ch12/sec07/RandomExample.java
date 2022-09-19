package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		//선택 번호
		int[] selectNumber = new int[6]; //선택번호 6개 저장
		Random random = new Random(3); // 선택번호를 얻기 위한 random 객체 생성
		System.out.print("선택번호: ");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) + 1; //1~45의 값 추출
			System.out.print(selectNumber[i] + "\n");
		}
		
		//당첨 번호
		int[] winningNumber = new int[6]; //당첨번호 6개 저장
		random = new Random(4);
		System.out.print("당첨번호: ");
		for(int i=0; i<6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + "\n");
		}
		
		//당첨 여부
		//정렬
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.print("당첨여부: ");
		if(result) {
			System.out.println("1등 당첨");
		} else {
			System.out.println("당첨 되지 않음");
		}
		
		
		
		
		
	}

}
