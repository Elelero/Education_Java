class Solution {
    public int solution(int num) {
        int answer = 0;
        int count = 0;
        
        for(int i=0; i<500; i++){
            if(num!=1 && num%2==0){
                num /= 2;
                count++;
            } else if(num!=1 && num%2==1){
                num = (num*3) + 1;
                count++;
            } else if(num==1){
                answer = count;
                break;
            } else {
                answer = -1;
                break;
            }
        }
        return answer;
    }
}
