package ch17.sec07.exam01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {

	public static void main(String[] args) {
		//List 컬렉션 생성
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 30));
		studentList.add(new Student("사길동", 10));
		studentList.add(new Student("김길동", 20));
		
		//점수를 기준으로 오름차순 정렬 새 스트림 얻기
		studentList.stream()
			.sorted()
			.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
		
		System.out.println("\n");
		
		//점수를 기준으로 내림차순 정렬 새 스트림 얻기
		studentList.stream()
			.sorted(Comparator.reverseOrder()) //비교자 이용!
			.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
	}

}
