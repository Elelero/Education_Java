package ch11.sec06;

public class Account {
	//필드
	private long balance;
	//생성자
	public Account() {}
	//getter 메소드 (잔고 메소드)
	public long getBalance() {
		return balance;
	}
	//예금 메소드
	public void deposit(int money) {
		balance += money;
	}
	//출금 메소드
	public void withdraw(int money) throws InsufficientException {
		if(balance<money) { //출금액이 잔고액보다 많을 경우
			//예외 처리
			throw new InsufficientException("잔고 부족: " + (money-balance)+"모자람");
		}
		balance -= money;
	}
	
}
