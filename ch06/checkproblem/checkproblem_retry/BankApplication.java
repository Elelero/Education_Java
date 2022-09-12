package ch06.checkproblem;

import java.util.Scanner;

public class BankApplication {
	//계좌 정보 저장하는 배열 생성
	private static Account[] arr = new Account[100];
	//스캐너 선언 (객체 없이 사용하기 위해 static으로 선언)
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice = 0; //선택
		
		
		while(true) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.게좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			choice = Integer.parseInt(sc.nextLine());
			
			if(choice==1) {
				BankApplication.create();
			} else if(choice==2) {
				BankApplication.list();
			} else if(choice==3) {
				BankApplication.deposit();
			} else if(choice==4) {
				BankApplication.withdraw();
			} else if(choice==5) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else {
				System.out.println("번호를 잘못 입력하였습니다");
			}
		}
	}
	
	
	//계좌생성 메소드
	private static void create() {
		System.out.println("=======");
		System.out.println("계좌생성");
		System.out.println("=======");
		
		System.out.print("계좌번호: ");
		String createAccount = sc.nextLine();
		
		System.out.print("계좌주: ");
		String accountName = sc.nextLine();
		
		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(sc.nextLine());
		
		Account newAccount = new Account(createAccount, accountName, balance);
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==null) {
				arr[i] = newAccount;
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	//계좌목록 메소드
	private static void list() {
		System.out.println("=======");
		System.out.println("계좌목록");
		System.out.println("=======");
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=null) {
				Account account = arr[i];
				System.out.print(account.getCreateAccount()+"\t");
				System.out.print(account.getAccountName()+"\t");
				System.out.print(account.getBalance()+"\n");
				break;
			} else {
				System.out.println("등록된 계좌정보가 없습니다");
				break;
			}
		}
	}
	
	//예금 메소드
	private static void deposit() {
		System.out.println("=======");
		System.out.println("예금");
		System.out.println("=======");
		
		System.out.print("계좌번호: ");
		String createAccount = sc.nextLine();
		
		System.out.print("예금액: ");
		int depositMoney = Integer.parseInt(sc.nextLine());
		
		Account account = findAccount(createAccount);
		if(account!=null) {
			System.out.println(account.getBalance()+depositMoney);
			System.out.println("결과: 예금 성공");
		} else {
			System.out.println("결과: 예금 실패");
		}
	}
	
	//출금 메소드
	private static void withdraw() {
		System.out.println("=======");
		System.out.println("출금");
		System.out.println("=======");
		
		System.out.print("계좌번호: ");
		String createAccount = sc.nextLine();
		
		System.out.print("출금액: ");
		int withdrawMoney = Integer.parseInt(sc.nextLine());
		
		Account account = findAccount(createAccount);
		if(account!=null) {
			System.out.println(account.getBalance()-withdrawMoney);
			System.out.println("결과: 출금 성공");
		} else {
			System.out.println("결과: 출금 실패");
		}
	}
	
	//Account[ ]배열에서 입력한 계좌번호(createAccount)을 찾는 메소드
	private static Account findAccount(String createAccount) {
		Account account = null;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=null) {
				String dbCreateAccount = arr[i].getCreateAccount();
				if(dbCreateAccount.equals(createAccount)) {
					account = arr[i];
					break;
				}
			}
		}
		return account;
	}
}
