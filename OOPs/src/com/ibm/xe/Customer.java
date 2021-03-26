package com.ibm.xe;

public class Customer {
	private int custid;
	private String cname;
	private double credlimit;
	
	private static int autogen;
	
	static {
		autogen=200;
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
		this(-1,"none",0);
	}

	public Customer(int custid, String cname, double credlimit) {
		super();
		this.custid = autogen++;
		this.cname = cname;
		this.credlimit = credlimit;
	}
	
	public void printData() {
		System.out.println("Customer ID: " + custid + "\nCustomer Name: " + cname + "\nCredit Limit: " + credlimit);

}
}
