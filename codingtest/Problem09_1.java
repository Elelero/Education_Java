package codingTest;

import java.util.Scanner;

public class Problem09_1 {
	public static void main(String[] args) {
		
		//스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		//스캐너에 의해 입력받은 값을 배열화
		String[] map = sc.nextLine().split(""); //등고선
		//변수 선언
		int stair = 0; //계단 층수
		int sum = 0; //소모한 총 칼로리
		int slope =1; //경사도
		boolean change_slope = true; //경사도 변했을 때 사용할 변수
		
		for(int i=0; i<map.length; i++) {
			if(map[i].equals("(")) {
				stair++;
				sum += slope*stair;
			} else if(map[i].equals(")")) {
				sum += slope*stair;
				stair--;
			} else if(map[i].equals("#")) {
				if(change_slope==true) { //경사도가 급경사가 되었을 때
					slope = 2;
					change_slope=false;
				} else if(change_slope==false) { //경사도가 원래 경사로 돌아갔을 때
					slope = 1;
					change_slope=true;
				}
			}
				
		}

		
//		for(int i=0; i<map.length; i++) {
//			if(map[i].equals("(")) {
//				stair++;
//				sum += stair;
//			} else if(map[i].equals(")")) {
//				stair--;
//				sum += stair;
//			} else if(map[i].equals("#")) {	
//				for(int j=i+1; j<map.length; j++)
//					if(map[j].equals("#")) {
//						break;
//					} else if(map[j].equals("(")) {
//						stair++;
//						sum += 2*stair;
//					} else if(map[j].equals(")")) {
//						stair--;
//						sum += 2*stair;
//					}
//				}
//				break;	
//		}
//		for(int k=3; k<map.length; k++) {
//			if(map[k].equals("(")) {
//				stair++;
//				sum += stair;
//			} else if(map[k].equals(")")) {
//				stair--;
//				sum += stair;	
//			}
//		}	
//		System.out.println(sum);	
		
		
		
	}
}
