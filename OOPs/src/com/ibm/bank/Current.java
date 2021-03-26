package com.ibm.bank;

public class Current extends Account {
	private double overdraft;

	public Current() {
		// TODO Auto-generated constructor stub
	}

	public Current(String holder) {
		super(holder, INIT_CUR_BAL);
		this.overdraft=OD_LIMIT;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Deposit(int amount) {
		// TODO Auto-generated method stub
		
		if(overdraft == OD_LIMIT)
			balance += amount;
		if(amount<=OD_LIMIT-overdraft)
			overdraft += amount;
		else {
			overdraft =OD_LIMIT;
			amount = (int) (OD_LIMIT-overdraft);
			balance += amount;
			
			
		}
	}

	@Override
	public void Withdraw(int amount) throws balanceException {
		// TODO Auto-generated method stub
		if(amount> balance+overdraft)
			throw new balanceException("insufficient");
		if(amount<=balance)
			balance-=amount;
		else {
			amount=(int) (amount-balance);
			balance=MIN_CUR_BAL;
			overdraft -= balance;
		}
	}

	@Override
	public void Summary() {
		// TODO Auto-generated method stub
		super.Summary();
		System.out.println("overdraft: "+overdraft);
	}
	

}
