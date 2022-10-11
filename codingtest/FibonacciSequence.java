class Solution {
    public int solution(int n) {
    
        int answer = 0;
        
        int[] f = new int[n+2];
        
        for(int i=0; i<=n; i++){
            f[0] = 0;
            f[1] = 1;
            if(i>=2){
                f[i] = (f[i-1] + f[i-2])%1234567;
            }
            answer = f[n];
        }
        return answer;
    }
}
