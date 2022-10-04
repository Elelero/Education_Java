class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int idx = s.length()/2;

        if(s.length()%2==0){
            answer = arr[idx-1] + arr[idx];
        } else {
            answer = arr[idx];
        }
        return answer;
    }
}
