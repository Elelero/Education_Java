package codingTest;

import java.util.Arrays;

public class ChoiceTwoNumberPlus {

	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		int factorial = numbers.length * (numbers.length-1) / 2 ;
		int[] arr = new int[factorial];
		int idx =0;
		int count = 0;
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=i+1; j<numbers.length; j++) {
					arr[idx++] = numbers[i] + numbers[j];
				}
			}
		
		//배열 정렬
		Arrays.sort(arr);
		
		//배열 중복 제거 (boolean배열 사용)
		boolean[] booArr = new boolean [factorial];
		
		for(int i=0; i<booArr.length; i++) { 
			for(int j=i+1; j<booArr.length; j++) { //중복 여부 확인 반복문
				if(arr[i]==arr[j]) {
					booArr[j] = true;
				} 
			}
			if(booArr[i]==true) { //중복 개수 더하기 => 중복 개수를 제외한 결과 배열을 만들기 위함
				count++;
			}
			System.out.println(booArr[i]);
		}
		
		System.out.println(count);
		
		// 중복이 제거된 결과 배열 만들기
		int[] result = new int[arr.length-count];
		int idx1 = 0 ;
		for(int i=0; i<arr.length; i++) {
			if(booArr[i]==false) {
				result[idx1++] = arr[i];
			}
		}
		
		
		
		//결과값 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]);
		}
		
	}

}
