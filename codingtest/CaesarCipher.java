class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++){
            char charNum = s.charAt(i);
            if('a'<=charNum && charNum<='z'){
                if(charNum + n > 'z'){
                    answer += String.valueOf((char) (charNum + n - 26));
                } else {
                    answer += String.valueOf((char) (charNum + n));
                }
            } else if('A'<=charNum && charNum<='Z'){
                if(charNum + n > 'Z'){
                    answer += String.valueOf((char) (charNum + n - 26));
                } else {
                    answer += String.valueOf((char) (charNum + n));
                }
            } else {
                answer += " ";
            }
        }
        return answer;
    }
}
