package ch17.sec12.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {

	public static void main(String[] args) {
		
		//List 컬렉션 생성
		List<Student> totalList = new ArrayList<>();
		
		//list 객체 추가
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("김춘향", "여", 93));
		totalList.add(new Student("동길동", "남", 80));
		totalList.add(new Student("서춘향", "여", 65));

		//stream 객체 생성
		List<Student> maleList = totalList.stream()
				.filter(s -> s.getSex().equals("남"))
				.toList();
		//출력
		maleList.stream()
			.forEach(s -> System.out.println(s.getName()));
		
		//학생 이름을 키 & 학생의 점수를 값으로 갖는 Map 생성
		Map<String, Integer> map = totalList.stream()
				.collect(
						Collectors.toMap(
								s -> s.getName(),
								s -> s.getScore()
								)
						);
		System.out.println(map);
	}

}
