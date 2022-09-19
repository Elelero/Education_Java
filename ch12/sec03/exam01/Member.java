package ch12.sec03.exam01;

public class Member { //아무것도 상속을 안하면 자동적으로 Object를 상속하고 있는 중임
	//필드
	public String id;
	//생성자
	public Member(String id) {
		this.id = id;
	}
	//equals 메소드 재정의
	@Override
		public boolean equals(Object obj) {
			if(obj instanceof Member target) {
				if(id.equals(target.id)) {
					return true;
				} 
			}
			return false;
	}
}
