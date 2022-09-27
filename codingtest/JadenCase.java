class Solution {
    public String solution(String s) {
        
        String answer = "";
        String[] arr = s.split("");
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].getClass().getName().contains("String")){
                if(i==0){
                    arr[0] = arr[0].toUpperCase();
                } else if(arr[i-1].equals(" ")) {
                    arr[i] = arr[i].toUpperCase();
                } else {
                    arr[i] = arr[i].toLowerCase();
                }
            }
            answer += arr[i];
        }
        return answer;
    }
}
