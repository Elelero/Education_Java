package ch17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
	
	//field
	public static int sum;

	public static void main(String[] args) {
		
		//정수 스트림
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(a -> sum+=a );
		System.out.println("총합" + sum);
		
	}

}
