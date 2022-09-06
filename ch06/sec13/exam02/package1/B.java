package ch06.sec13.exam02.package1;

public class B {
	//필드 선언
	A a1 = new A(true);
	A a2 = new A(1); //같은 패키지 안에 있기 때문에 default지만 선언가능
	A a3 = new A("문자열"); //컴파일 에러(private 접근제한자로 설정되어있기 때문)
	
	
	
	
	
}
