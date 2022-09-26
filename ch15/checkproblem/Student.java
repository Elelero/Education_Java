package ch15.checkproblem;

public class Student {
	//field
	public int studentNum;
	public String name;
	
	//constructor
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	//여기에 문제에서 요구하는 코드 작성!
	@Override
	public int hashCode() {
		return studentNum;
	}
	
	//중복 저장되지 않도록 재정의
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Student target) {
//			return (target.studentNum==studentNum);
//		} else {
//			return false;
//		}
//	}
	
	//답지
	@Override
	public boolean equals(Object obj) {
		//만약 obj가 Student 타입 객체가 아니면 false 리턴
		if(!(obj instanceof Student)) return false;
		
		
		//강제타입변환
		Student student = (Student) obj;
		//입력한 studentNum이 필드의 student 클래스의 student와 같지 않으면 false;
		if(studentNum != student.studentNum) return false;
		return true;
	}

	
}
