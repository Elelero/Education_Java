class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int idx = 0;
        
        for(int i=0; i<arr.length; i++){
            idx++;
            if(i==0 || arr[i-1].equals(" ")){
                arr[i] = arr[i].toUpperCase();
                idx = 0;
            } else if(idx%2==0){
                arr[i] = arr[i].toUpperCase();
            } else if(idx%2!=0){
                arr[i] = arr[i].toLowerCase();
            }
            answer += arr[i];
        }
        return answer;
    }
}
