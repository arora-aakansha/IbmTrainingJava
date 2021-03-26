package com.ibm.emp;

public class Manager extends Employee {
	private double incentive;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String ename, double salary,double incentive) {
		super(ename, salary);
		// TODO Auto-generated constructor stub
		this.incentive=incentive;
	}

	@Override
	public void printPayslip() {
		// TODO Auto-generated method stub
		super.printPayslip();
		System.out.println("Incentive: "+incentive);
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary()+incentive;
	}
	
	

}
