class Solution {
    public boolean solution(String s) {
        boolean answer = true; 
        
        for(int i=0; i<s.length(); i++){
            if(s.length()==4 || s.length()==6){
                for(char j='A'; j<='z'; j++){
                    if(s.charAt(i)==j){
                        answer = false;
                    } 
                }
            } else {
                answer = false;
            }
        }
        return answer;
    }
}
