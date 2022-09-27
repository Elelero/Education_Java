package ch17.sec02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {

	public static void main(String[] args) {
		
		//List 컬렉션 생성
		List<String> list = new ArrayList<>();
		//컬렉션에 객체 추가
		for(int i=0; i<1000; i++) {
			list.add("홍길동" + i);
		}
		
		//Stream 객체 생성
		Stream<String> stream = list.parallelStream(); //parallelStream = 병렬 스트림
		stream.forEach(name -> {
			Thread thread = Thread.currentThread();
			System.out.println(name + ": " + thread.getName());
		});
		
		
	}

}
