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

//다른풀이------------------------------------------------------------------------
class Solution {
    public String solution(String s, int n) {
        char[] arr = new char[s.length()];
        String answer = "";
        for(int i=0; i<arr.length; i++) {
            arr[i] = s.charAt(i);
            if('a' <= arr[i] && arr[i] <= 'z') {
                arr[i] += n;
                if(arr[i] > 'z') {
                    arr[i] -= 26;
                }
            } else if ('A' <= arr[i] && arr[i] <= 'Z') {
                arr[i] += n;
                if(arr[i] > 'Z') {
                    arr[i] -= 26;
                }
            }
            answer += arr[i];
        }
        return answer;
    }
}

//다른풀이------------------------------------------------------------------------
class Solution {
    public String solution(String s, int n) {
      String answer = "";
      for (int i = 0; i < s.length(); i++) {
         char alpa = s.charAt(i);

         if (alpa >= 'a' && alpa <= 'z') { // 소문자
            if (alpa + n > 'z') // z가 있을 때,
               answer += (char) (alpa + n - 26);
            else
               answer += (char) (alpa + n);
         } else if (alpa >= 'A' && alpa <= 'Z') { // 대문자
            if (alpa + n > 'Z') // Z가 있을 때,
               answer += (char) (alpa + n - 26);
            else
               answer += (char) (alpa + n);
         } else
            answer += (char) alpa;
      }
      return answer;
    }
}
