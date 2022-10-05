import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;
        int sum = 0;
        
        for(int i=0; i<d.length; i++){
            sum += d[i];
            if(sum<=budget){
                answer++;
            } else if(sum>budget){
                break;
            }
        }
        return answer;
    }
}

//다른 풀이------------------------------------------
import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;
        for(int i=0; i<d.length; i++) {
            budget -= d[i];
            if(budget < 0) {
                break;
            } else if(budget == 0) {
                answer++;
                break;
            }
            answer++;
        }
        
        return answer;
    }
}


//다른 풀이------------------------------------------
import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int sum=0;
        int count=0;
        Arrays.sort(d);
        for(int j : d) {
           sum+=j;
           if(sum<=budget) {
              count++;
           }
        }
        return count;
    }
}
