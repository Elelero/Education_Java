package codingTest;

public class SecretMap {

	public static void main(String[] args) {
//		int n = 5;
//		int[] arr1 = { 9, 20, 28, 18, 11 };
//		int[] arr2 = { 30, 1, 21, 17, 28 };
		int n = 12;
		int[] arr1 = {1000, 33, 33 ,22, 31, 50, 46, 33, 33 ,22, 31, 50};
		int[] arr2 = {27 , 4000, 19, 14, 14, 10, 27 ,56, 19, 14, 14, 10};
		
		int[] arr3 = new int[n];
		String[] binary = new String[n];
		String[] binary3 = new String[n]; //뒤집은 문자열을 담을 배열
		
		for(int i=0; i<n; i++) {
			arr3[i] = arr1[i]|arr2[i];
			
			while(true) {
				if(arr3[i]>1) {
					if(arr3[i]%2==1) {
						binary[i] += "#";
						arr3[i] /= 2;
					} else if(arr3[i]%2==0) {
						binary[i] += "0";
						arr3[i] /= 2;
					}
				} else if(arr3[i]==1) {
					binary[i] += "#";
					break;
				}
			}
			binary[i] = binary[i].replace("null", ""); //null값(초기값) 없애기
			
			//앞의 공백 채우기
			if(binary[i].length()<n) {
				for(int j=binary[i].length(); j<n; j++ ) {
					binary[i] += "0";
				}
			}

			//문자열 뒤집기 반복문
			String[] binary2 = binary[i].split("");
			for(int j=binary[i].length()-1; j>=0; j--) {
				binary3[i] += binary2[j];
			}
			binary3[i] = binary3[i].replace("null", ""); //null값(초기값) 없애기
			binary3[i] = binary3[i].replace("0", " "); //0을 공백으로 바꾸기
			
			System.out.println(binary3[i]);
		}
		
		
		
	}

}
