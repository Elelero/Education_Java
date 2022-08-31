package codingTest;

import java.util.Arrays; //배열 정렬을 위해 쓴 배열 라이브러리
import java.util.Scanner;

public class Problem11 {
	public static void main(String[] args) {
		
		//#문제(Lv01) 로또 최고 순위와 최저순위
		//배열
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};

		//변수
        int min = 0; //일치하는 번호의 최소개수
        int max = 0; //일치하는 번호의 최대개수
        
        //반복문
        for(int i=0; i<6; i++){
        	for(int j=0; j<6; j++){
        		//최소개수
        		if(lottos[i] != 0){
                    if(lottos[i]==win_nums[j]){
                        min++;
                    }
        		}
        	}
        	//0에 들어갈 수 있는 최대개수
    		if(lottos[i]==0) {
    			max++;
        		}
        	}
        
        //최종 최대개수
        max = min + max;
        
        //순위
        int max_rank = 7-max;
        int min_rank = 7-min;
       
        //answer배열에 등수 놓기
        int[] answer = {max_rank, min_rank};
        
        for(int i=0; i<2; i++) {
        	System.out.println(answer[i]);
        }		
		
	}
}
