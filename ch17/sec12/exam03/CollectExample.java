package ch17.sec12.exam03;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import ch17.sec12.exam01.Student;

public class CollectExample {

	public static void main(String[] args) {
		
		//List 컬렉션 생성
		List<Student> totalList = new ArrayList<>();
		//list 객체 추가
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("이춘향", "여", 75));
		totalList.add(new Student("전우치", "남", 66));
		totalList.add(new Student("연선", "여", 89));
		
		//stream
		Map<String, Double> map = totalList.stream()
			.collect(
				Collectors.groupingBy(
					s -> s.getSex(),
					Collectors.averagingDouble(s -> s.getScore())
				)
			);
		System.out.println(map);		
	}

}
