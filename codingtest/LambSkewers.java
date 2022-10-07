class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        //양꼬치 + 음료수
        answer = 12000*n +2000*k ;

        //음료수 서비스
        int count = n/10;
        answer -= count*2000;
        
        return answer;
    }
}
