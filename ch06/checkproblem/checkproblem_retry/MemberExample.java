package ch06.checkproblem;

public class MemberExample {

	public static void main(String[] args) {
		//객체 생성 및 선언
		MemberService memberService = new MemberService();
		
		boolean result = memberService.login("hong", "12345");
		
		//메소드 호출
		if(result) {
			System.out.println("로그인 되었습니다");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않음");
		}
	}

}

