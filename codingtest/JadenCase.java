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

------------------------------------------------------------------------------
//다른 풀이
public class Main {
	public static void main(String[] args) {
		//String s = "3people unFollowed me";
		//String s = "3people unfollowed  me";
		String s = "for the last week";
		
		String answer = "";
		char[] arr = new char[s.length()];
		for(int i=0; i<arr.length; i++) {
			arr[i] = s.charAt(i);
			if(arr[i] >= 'A' && arr[i] <= 'Z') {
				arr[i] += 32;
			}
			if(i != 0) {
				if(arr[i-1] == ' ' && arr[i] >= 'a' && arr[i] <= 'z') {
					arr[i] -= 32;
				}
			} else {
				if(arr[i] >= 'a' && arr[i] <= 'z') {
					arr[i] -= 32;
				}
			}
			answer += arr[i];
		}
		System.out.println(answer);
	}
}
