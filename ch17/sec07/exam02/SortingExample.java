package ch17.sec07.exam02;

import java.util.ArrayList;
import java.util.List;

public class SortingExample {

	public static void main(String[] args) {
		
		//List 컬렉션 생성
		List<Student> studentList = new ArrayList<>();
		
		//list 객체 추가
		studentList.add(new Student("홍길동", 20));
		studentList.add(new Student("동길동", 30));
		studentList.add(new Student("서길동", 10));
		
		//점수를 기준으로 오름차순 정렬 새 스트림
		studentList.stream()
		.sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
		.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));

		System.out.println("\n");
		
		//점수를 기준으로 내림차순 정렬 새 스트림
		studentList.stream()
		.sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
		.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
		
		System.out.println("\n");
		
		//이름을 기준으로 오름차순 정렬 새 스트림 (교수님이 따로 해보라고 말씀하신 실습)
		studentList.stream()
		.sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
		.forEach(s -> System.out.println(s.getName()));
		
	}

}
