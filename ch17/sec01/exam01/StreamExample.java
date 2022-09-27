package ch17.sec01.exam01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		//Set 컬렉션 생성
		Set<String> set = new HashSet<>();
		//객체 추가
		set.add("홍길동");
		set.add("김길동");
		set.add("감자바");
		
		//외부 반복자 - 1 (for문 이용)
		for(String item : set) {
			System.out.println(item);
		}
		System.out.println("\n");
		//외부 반복자 - 2 (반복자 생성 & while문)
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String item = iterator.next();
			System.out.println(item);
		}
		
		System.out.println("\n");
		
		
		//내부 반복자 - stream 이용
		Stream<String> stream = set.stream(); //Set 내부의 스트림 객체 생성
		stream.forEach((item)->{
			System.out.println(item);
		}); //stream 흘러가면서 요소를 하나씩 람다식으로 실행
		System.out.println("\n");
		
		//stream()은 한번 사용밖에 못하기에 다시한번 선언해줘야함
		stream = set.stream(); 
		stream.forEach((item)-> System.out.println(item));
		
	}

}
