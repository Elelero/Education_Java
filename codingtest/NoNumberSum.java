package codingTest;

public class NoNumberSum {

	public static int main(int[] numbers) {
		        // int answer = -1;
		        
		        int sum1 = 0;
		        //1~9까지 더하기
		        for(int i=1; i<=9; i++){
		            sum1 += i;
		        }
		        
		        int sum2 = 0;
		        //배열 수 더하기
		        for(int i=0; i<numbers.length; i++){
		            sum2 += numbers[i];
		        }
		        
		        int answer = sum1 - sum2;
		        return answer;
		        
	}

}
