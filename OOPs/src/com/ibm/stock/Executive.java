package com.ibm.stock;
import com.ibm.emp.Employee;

public class Executive extends Employee {
	private double comission;
	
			
	public Executive() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Executive(String ename, double salary, double comission) {
		super(ename, salary);
		this.comission=comission;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printPayslip() {
		// TODO Auto-generated method stub
		super.printPayslip();
		System.out.println("comission: "+comission);
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary()+comission;
		
	}
	
	

}
