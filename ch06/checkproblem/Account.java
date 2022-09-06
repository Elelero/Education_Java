package ch06.checkproblem;

import java.util.Scanner;

public class Account {
	//상수 선언
	private int balance;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	//getter & setter
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if( balance<MIN_BALANCE || balance>MAX_BALANCE ) {
			return; //작성해도 되고 안해도 됨!
		} else {
			this.balance = balance;
		}
	}
	
	
//--#20.계좌 객체 생성---------------------------------------------------
	//필드 선언
	private String ano; //계좌번호
	private String owner; //계좌주인
	private int balance1; //초기입금액
	//생성자 선언
	public Account(String ano, String owner, int balance1) {
		this.ano = ano;
		this.owner = owner;
		this.balance1 = balance1;
	}
	//메소드 선언(getter&setter)
	public String getAno() {return ano;}
	public void setAno(String ano) {this.ano = ano;}
	public String getOwner() {return owner;}
	public void setOwner(String owner) {this.owner = owner;}
	public int getBalance1() {return balance1;}
	public void setBalance1(int balance1) {this.balance1 = balance1;}
	
}
