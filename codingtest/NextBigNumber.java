class Solution {
    public int solution(int n) {
        int answer = 0;
        int count1 = 0;
        int count2 = 0;
        
        String binaryStr;
        String[] binaryArr;

        while(true) {
        	binaryStr = Integer.toBinaryString(n);
        	binaryArr = binaryStr.split("");
        	
        	for(int i=0; i<binaryArr.length; i++) {
        		if(binaryArr[i].equals("1")) {
        			count1++;
        		}
        	}
        	
        	n++;
        	
        	binaryStr = Integer.toBinaryString(n);
        	binaryArr = binaryStr.split("");
        	
        	for(int i=0; i<binaryArr.length; i++) {
        		if(binaryArr[i].equals("1")) {
        			count2++;
        		}
        	}
        	
        	if(count1==count2) {
        		break;
        	}
        }
        
        return n;
        
    }
}
