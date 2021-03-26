package com.ibm.bank;

public interface Banking {
	void Summary();
	void Deposit(int amount) ;
	 void Withdraw(int amount) throws balanceException;
	 void statement();
}
