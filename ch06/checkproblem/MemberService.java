package ch06.checkproblem;

public class MemberService {
	
	//login 메소드 선언 (내가 푼것)
	boolean login(String id, String password) {
		boolean result = false;
		if(id.equals("hong") && password.equals("12345")) {
			result = true;
		}
		return result;
	}
	
	//교재 답
/*	boolean login1(String id, String password) {
		if(id.equals("hong")&&password.equals("12345")){
			return true; //여기까지만 작성하면 컴파일 에러뜸
		} else {
			return false; //else까지 작성해줘야 정상작동
		}
	}
*/	
	//logout 메소드 선언(내가 푼것)
	void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다");
	}
	
	
}
