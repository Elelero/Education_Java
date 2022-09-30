package ch17.sec11;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {

	public static void main(String[] args) {
		
		//List 객체 생성
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 92),
				new Student("김길동", 95),
				new Student("서길동", 88)
		);
		
		//방법1
		int sum1 = studentList.stream()
				.mapToInt(Student::getScore)
				.sum();
		System.out.println(sum1);

		//방법2
		int sum2 = studentList.stream()
				.map(Student::getScore)
				.reduce(0, (a, b) -> a+b);
		System.out.println(sum2);
		
	}

}
