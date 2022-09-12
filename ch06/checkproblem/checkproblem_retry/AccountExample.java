package ch06.checkproblem;

public class AccountExample {

	public static void main(String[] args) {
		
		//객체 생성
		Account account = new Account();
		
		//메소드 호출
		account.setBalance(10000);
		System.out.println("현재 잔고: " + account.getBalance());

		account.setBalance(-100);
		System.out.println("현재 잔고: " + account.getBalance());

		account.setBalance(20000000);
		System.out.println("현재 잔고: " + account.getBalance());

		account.setBalance(300000);
		System.out.println("현재 잔고: " + account.getBalance());

	}

}
