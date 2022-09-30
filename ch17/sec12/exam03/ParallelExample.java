package ch17.sec12.exam03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class ParallelExample {

	public static void main(String[] args) {
		
		//Random 객체 생성
		Random random = new Random();
		
		//List 컬렉션 생성
		List<Integer> scores = new ArrayList<>();
		for(int i=0; i<100000000; i++) {
			scores.add(random.nextInt(101));
		}
		
		//변수 선언
		double avg = 0.0;
		long startTime = 0;
		long endTime = 0;
		long time = 0;
		
		//Stream 객체 생성 (싱글 스레드)
		Stream<Integer> stream = scores.stream();
		startTime = System.nanoTime();
		avg = stream
				.mapToInt(i -> i.intValue())
				.average()
				.getAsDouble();
		endTime = System.nanoTime();
		time = endTime - startTime;
		System.out.println("avg: " + avg + ", 일반 스트림 처리시간: " + time + "ns");

		//Stream 객체 생성 (병렬 스레드)
		Stream<Integer> parallelStream = scores.parallelStream();
		startTime = System.nanoTime();
		avg = parallelStream
				.mapToInt(i -> i.intValue())
				.average()
				.getAsDouble();
		endTime = System.nanoTime();
		time = endTime - startTime;
		System.out.println("avg: " + avg + ", 병렬 스트림 처리시간: " + time + "ns");
	}

}
