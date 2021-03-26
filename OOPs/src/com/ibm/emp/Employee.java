package com.ibm.emp;

public abstract class Employee {
	private int empid;
	private String ename;
	private double salary;
	
	private static int autogen;
	
	static {
		//static intializer block
		//it executes at the time of class loading
		System.out.println("Employee class is ready....");
		autogen=100;
	}
	
	//Constructors
	public Employee() {
		// TODO Auto-generated constructor stub
		this("ano",0);
	}
	
	

	public Employee(String ename, double salary) {
		super();
		this.empid = autogen++;
		this.ename = ename;
		this.salary = salary;
	}
	
	public void printPayslip() {
		System.out.println("Empid: " + empid + "\nName: " + ename + "\nSalary: " + salary);
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}


	}


