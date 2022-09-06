package ch06.sec13.exam02.package2;

import ch06.sec13.exam02.package1.A;

public class C {
	//필드 선언
		A a1 = new A(true);
		A a2 = new A(1); //같은 패키지가 아니기 떄문에 선언불가
		A a3 = new A("문자열"); //private이기 때문에 선언불가
		
}
