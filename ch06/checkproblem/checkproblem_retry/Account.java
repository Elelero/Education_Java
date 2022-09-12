package ch06.checkproblem;

public class Account {
	//필드 선언
	private String createAccount; //계좌번호
	private String accountName; //계좌주
	private int balance; //잔고
	
	//생성자 선언
	public Account(String createAccount, String accountName, int balance) {
		this.createAccount = createAccount;
		this.accountName = accountName;
		this.balance = balance;
	}
	
	//getter & setter 메소드 선언
	public String getCreateAccount() {
		return createAccount;
	}

	public void setCreateAccount(String createAccount) {
		this.createAccount = createAccount;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}

