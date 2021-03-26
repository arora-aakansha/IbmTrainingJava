package com.ibm.xe;

public class Payment {
	private double accountno;
	private double balance;
	public double getAccountno() {
		return accountno;
	}
	public void setAccountno(double accountno) {
		this.accountno = accountno;
	}
	public double getBalance() {
		return balance;
	}
	public double setBalance(double balance) {
		return this.balance = balance;
	}
	public Payment(double accountno, double balance) {
		super();
		this.accountno = accountno;
		this.balance = balance;
	}
	
	
}
