/**
 * This is account class
 * @author aaknsha arora
 * @version :1.0
 */
package com.ibm.bank;
public abstract class Account implements Banking {
	private int actno;
	private String holder;
	protected double balance;
	public static final int INIT_ACC_NO=1001;
	public static final double MIN_SAVING_BALANCE=1000;
	public static final double OD_LIMIT=10000;
	public static final double INIT_CUR_BAL=5000;
	public static final double MIN_CUR_BAL=0;

	
	private static int autogen;
	
	protected Transaction[] tnxs;
	protected int idx;
	
	static {
		autogen=INIT_ACC_NO;
	}
	/*This is default constructor*/
	public Account() {
		// TODO Auto-generated constructor stub
		this("none",0);
	}
 /** this is parameter constructor**/
	public Account(String holder, double balance) {
		super();
		this.actno = autogen++;
		this.holder = holder;
		this.balance = balance;
		
		tnxs = new Transaction[10];
		tnxs[idx++] = new Transaction("OB", balance, balance);
		
	}
	
	public  void Summary() {
		System.out.println("Account Number: "+ actno +"\nHolder: " + holder +"\nBalance: " + balance);
	}
	
	public void Deposit(int amount) {
		balance += amount;
		
		tnxs[idx++] = new Transaction("CR", amount , balance);
	}
	

	public abstract void Withdraw(int amount) throws balanceException;
//	{
//		if(amount > balance) {
//			System.out.println("Not enough balance");
//		}
//		else {
//			balance -= amount;
//		}
//	}
//
		// TODO Auto-generated method stub
	
	public void statement() {
		System.out.println("Statement of A/c:" + actno);
		for(int i=0;i<idx;i++) {
			tnxs[i].print();
		}
	}
		
	}
	


