package ch17.sec12.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {

	public static void main(String[] args) {
		
		//List 컬렉션 생성
		List<Student> totalList = new ArrayList<>();
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("김춘향", "여", 85));
		totalList.add(new Student("김자바", "남", 65));
		totalList.add(new Student("수덕순", "여", 99));
		
		Map<String, List<Student>> map = totalList.stream()
				.collect(
					Collectors.groupingBy(s -> s.getSex())
						);
		
		List<Student> maleList = map.get("남");
		maleList.stream().forEach(s -> System.out.println(s.getName()));
		
		System.out.println("\n");
		
		List<Student> femaleList = map.get("여");
		femaleList.stream().forEach(s -> System.out.println(s.getName()));
		
	}

}
