package ch17.sec04.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		//String타입 배열 생성
		String[] strArray = {"홍길동", "신용권", "김미나"};
		//스트림 배열로 변환
		Stream<String> strStream = Arrays.stream(strArray);
		//스트림 배열 요소 하나씩 추출
		strStream.forEach(item -> System.out.print(item + ","));
		System.out.println();
		
		//int타입 배열 생성
		int[] intArray = {1, 2, 3, 4, 5};
		//스트림 배열로 변환
		IntStream intStream = Arrays.stream(intArray);
		//스트림 배열 요소 하나씩 추출
		intStream.forEach(item -> System.out.print(item+","));
		System.out.println();
	}

}
