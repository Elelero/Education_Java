package ch06.checkproblem;

public class ShopService {
	//private 접근 권한을 갖는 '정적 필드' 선언&호출
	private static ShopService singleton = new ShopService();
	
	//private 접근 권한을 갖는 '생성자' 선언
	private ShopService() { }
	
	//public 접근 권한을 갖는 '정적 메소드' 선언
	public static ShopService getInstance() {
		return singleton;
	}
}
