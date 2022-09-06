package ch06.checkproblem;

import java.util.Scanner;

public class BankApplication {
	
	//필드 선언
	private static Scanner sc = new Scanner(System.in); //스캐너 객체 생성
	private static Account[] accountArr = new Account[100]; //Account 배열 생성

========//main 메소드 생성//========================================================================
	public static void main(String[] args) {
		
		//변수 선언
		boolean program = true;
		
		while(program) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			
			int choice = Integer.parseInt(sc.nextLine());
			
			if(choice==1) {
				createAccount();
			 } else if(choice==2) {
				 accountList();
			 } else if(choice==3) {
				 deposit();
			 } else if(choice==4) {
				 withdraw();
			 } else if(choice==5) {
				 program = false;
			 }
		}
		System.out.println("시스템이 종료되었습니다");
	}
	
	
========//기능 메소드 생성//========================================================================		
	//1.계좌생성 메소드
	private static void createAccount() {
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		
		System.out.print("계좌번호: ");
		String ano = sc.nextLine();
		
		System.out.print("계좌주: ");
		String owner = sc.nextLine();
		
		System.out.print("초기입금액: ");
		int balance1 = Integer.parseInt(sc.nextLine());
		
		Account newAccount = new Account(ano, owner, balance1);
		for(int i=0; i<accountArr.length; i++) {
			if(accountArr[i]==null) {
				accountArr[i] = newAccount;
				System.out.println("결과: 계좌가 생성되었습니당!");
				break;
			}
				
		}
		
	}
		
	//2.계좌목록보기
	private static void accountList() {
		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");
		for(int i=0; i< accountArr.length; i++) {
			if(accountArr[i] != null) {
				Account account = accountArr[i];
				System.out.print(account.getAno() + "\t");
				System.out.print(account.getOwner() + "\t");
				System.out.print(account.getBalance1() + "\t");
			} else {
				System.out.println("등록된 정보가 없습니다!");
				break;
			}
		}
	}
		
	//3.예금하기
	private static void deposit() {
		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");
		System.out.print("계좌번호: ");
		String ano = sc.nextLine();
		System.out.print("예금액: ");
		int money = sc.nextInt();
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setBalance1(account.getBalance1() + money);
		System.out.println("결과: 예금이 성공되었습니다.");
	}
	
	//4.출금하기
	private static void withdraw() {
		System.out.println("------");
		System.out.println("출금");
		System.out.println("------");
		System.out.print("계좌번호: ");
		String ano = sc.nextLine();
		System.out.print("출금액: ");
		int money = sc.nextInt();
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다");
			return;
		}
		account.setBalance1(account.getBalance1() - money);
		System.out.println("결과: 출금이 성공되었습니다.");
	}
		
	//<findAccount> 만들기
	//Account 배열에서 ano와 동일한 Account 객체 찾기!
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0; i<accountArr.length; i++) {
			if(accountArr[i] != null) {
				String dbAno = accountArr[i].getAno();
				if(dbAno.equals(ano)) {
					account = accountArr[i];
					break;
				}
			}
		}
		return account;
	}
}

