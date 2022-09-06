package ch06.checkproblem;

public class CheckExample {

	public static void main(String[] args) {
		//#14.Member 객체 생성
		Member user1 = new Member("홍길동", "hong");
		System.out.println("이름: " + user1.name);
		System.out.println("아이디: " + user1.id);
		
		//#15.MemberService객체 생성
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다");
		}
		
		//#16.Printer 객체 생성
/*		printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
*/		
		//#17.정적메소드 호출
		Printer printer = new Printer();
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");
		
		//#18.정적 메소드를 호출해서 싱글톤 객체 얻기
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		if(obj1==obj2) {
			System.out.println("같은 ShopService 객체 입니다!"); //o
		} else {
			System.out.println("다른 ShopService 객체 입니다ㅜ");
		}
		
		//#19.Account 객체 생성
		Account account = new Account();
		//출력
		account.setBalance(10000);
		System.out.println("현재 잔고는 " + account.getBalance()); //10000
		account.setBalance(-100);
		System.out.println("현재 잔고는 " + account.getBalance()); //10000
		account.setBalance(2000000);
		System.out.println("현재 잔고는 " + account.getBalance()); //10000
		account.setBalance(300000);
		System.out.println("현재 잔고는 " + account.getBalance()); //300000
		
		
		
	}
}
