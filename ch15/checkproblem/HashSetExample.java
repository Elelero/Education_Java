package ch15.checkproblem;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		//HashSet 컬렉션 생성
		Set<Student> set = new HashSet<Student>();
		
		//Student 객체 저장
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
		set.add(new Student(1, "조민우"));
		
		//저장된 객체 출력
		System.out.println("저장된 객체 수: " + set.size());
		for(Student s : set) {
			System.out.println(s.studentNum + ":" + s.name);
		}
		
	}

}
