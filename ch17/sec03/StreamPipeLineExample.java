package ch17.sec03;

import java.util.List;

public class StreamPipeLineExample {

	public static void main(String[] args) {
		
		//List 컬렉션 생성 
		List<Student> list = List.of( //수정이 불가한 리스트를 만듬
			new Student("홍길동", 10),
			new Student("김길동", 20),
			new Student("서길동", 30)
		); 
/*		List<Student> list = new ArrayList<>(); //이렇게 작성해도 무관!
		list.add(new Student("홍길동", 10));
		list.add(new Student("김길동", 20));
		list.add(new Student("서길동", 30)); */
		
		
		//메소드 체이닝 - 평균값 구하기
		double avg = list.stream()
				.mapToInt(student -> student.getScore())
				.average()
				.getAsDouble();
		
		System.out.println("평균점수: " + avg);
		
		//메소드 체이닝 - 학생이름 추출
		list.stream()
			.map(student -> student.getName())
			.forEach(name -> System.out.println(name));
	}

}
