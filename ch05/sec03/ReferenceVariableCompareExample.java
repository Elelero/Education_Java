package ch05.sec03;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		int[] arr1; //배열 변수 arr1 선언
		int[] arr2; //배열 변수 arr2 선언
		int[] arr3; //배열 변수 arr3 선언
		
		arr1 = new int[] {1, 2, 3}; //배열 {1, 2, 3}을 생성하고 arr1 변수에 대입
									//배열을 힙에 저장하고, 그 힙에 생성된 번지를 arr1 번수에 저장
		arr2 = new int[] {1, 2, 3}; //배열 {1, 2, 3}을 생성하고 arr2 변수에 대입
		
		arr3 = arr2; //배열 변수 arr2의 값을 배열 변수 arr3에 대입
					 //arr2에 있는 번지를 arr3에 저장
		
		System.out.println(arr1 == arr2); //arr1과 arr2 변수가 같은 배열을 참고하는지 검사
		System.out.println(arr2 == arr3); //arr2과 arr3 변수가 같은 배열을 참고하는지 검사
	}
}
