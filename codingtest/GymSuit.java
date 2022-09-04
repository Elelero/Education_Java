package codingTest;

import java.util.Arrays;
import java.util.Scanner;

public class GymSuit {

	public static void main(String[] args) {
		
	//입력값
	int n = 5;
	int[] lost = {2, 4};
	int[] reserve = {1, 3, 5};	
	        
        int count = 0; // 체육복을 빌린 학생들의 수
        int sum = 0; // 최종적으로 값을 내릴 수
        
        //배열 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        //반복문
        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    lost[i] = 35;
                    reserve[j] = 33;
                    count++;
                }
            }
        }

        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if(lost[i]-1 == reserve[j]) {
                    count++;
                    reserve[j] = 33;
                    break;
                } else if(lost[i]+1 == reserve[j]) {
                    count++;
                    reserve[j] = 33;
                    break;
                }
            }
        }
        
        sum = n -(lost.length-count);
        
        int answer = sum;
        System.out.println(answer);
	}

}
