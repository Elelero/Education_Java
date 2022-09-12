package ch06.checkproblem;

public class ShopServiceExample {

	public static void main(String[] args) {

		//싱클톤 호출
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		//두 객체가 같은 객체인지 확인
		if(obj1==obj2) {
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
		}
		
	}

}
