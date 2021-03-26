package com.ibm.bank;

public final class AccountFactory {
	
	private AccountFactory() {
		// TODO Auto-generated constructor stub
	}
	public static Banking OpenSavingAccount(String holder) {
		return new Saving(holder);
	}
	
	public static Banking openCurrentAccount(String holder) {
		return new Current(holder);
	}
}
