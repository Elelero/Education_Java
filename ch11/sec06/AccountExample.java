package ch11.sec06;

public class AccountExample {

	public static void main(String[] args) {
		//계좌 객체 생성
		Account account = new Account();
		
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		
		//예외처리코드 무조건 작성해야함
		try {
			account.withdraw(100);
		} catch(InsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
		System.out.println("예금액: " + account.getBalance());
	}

}
