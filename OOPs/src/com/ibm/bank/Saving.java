package com.ibm.bank;
public class Saving extends Account {
	public Saving() {
		// TODO Auto-generated constructor stub
	}

	public Saving(String holder) {
		super(holder, MIN_SAVING_BALANCE);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Withdraw(int amount) throws balanceException {
		// TODO Auto-generated method stub
		if(amount <= (balance-MIN_SAVING_BALANCE)) {
			balance -= amount;
			tnxs[idx++]=new Transaction("DR",amount,balance);
		}
		else
			throw new balanceException("insufficiient balance");
	}
	
	
		
		}
		
		

