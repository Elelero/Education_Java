package ch06.checkproblem;

public class ShopService {
	//싱글톤 패턴(=객체 하나만 생성할 수 있는 것)
	//private 접근 권한을 갖는 정적 필드 선언과 초기화
	private static ShopService singleton = new ShopService();
	
	//private 접근 권한을 갖는 생성자 선언
	private ShopService() {	}
	
	//public 접근 권한을 갖는 정적 메소드 선언 (타입 자리에 클래스명 넣어야함)
	public static ShopService getInstance() {
		return singleton;
	}
}
