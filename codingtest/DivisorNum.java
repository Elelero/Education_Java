package codingTest;

public class DivisorNum {

	public static void main(String[] args) {
		int left = 13;
		int right = 17;
		int answer = 0;
        int sum = 0;
        int count;
        
        for(int i=left; i<=right; i++){
        	count = 0; //여기에 선언안하면 누적이 되서 값이 안나옴!
            for(int j=1; j<=right; j++){
                if(i%j==0) {
                	count++;
                }
            }
            
            if(count%2==0) {
            	sum += i;
            } else if(count%2==1) {
            	sum -= i;
            }
    	}
        System.out.println(sum);
	}
}
