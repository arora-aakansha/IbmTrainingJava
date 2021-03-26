package com.ibm.xe;
public class LoyalCutomer extends Customer {
	
	private double discount;

	public LoyalCutomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoyalCutomer(int custid, String cname, double credlimit, double discount) {
		super(custid, cname, credlimit);
		// TODO Auto-generated constructor stub
		this.discount=discount;
	}

	@Override
	public void printData() {
		// TODO Auto-generated method stub
		super.printData();
		System.out.println("discount: "+ discount);
	}
	
	

}
