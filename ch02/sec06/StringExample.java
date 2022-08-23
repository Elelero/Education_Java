package ch02.sec06;

public class StringExample {
	public static void main(String[] args) {
		String name = "홍길동";
		String job = "프로그래머";
		System.out.print(name);		//print는 뒤에 줄바꿈 안이루어짐!
		System.out.println(job);	//println을 작성해야 줄바꿈이 이루어짐!
		
		String str = "나는 \"자바를\" 배웁니다.";
		System.out.println(str);
		
		str = "번호\t이름\t직업";
		System.out.println(str);
		
		System.out.print("나는\n");
		System.out.print("자바를\n");
		System.out.print("배웁니다.");
	}

}
