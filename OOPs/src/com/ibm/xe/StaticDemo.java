package com.ibm.xe;

public class StaticDemo {
	private int data;
	private static int count;
	
	public  StaticDemo(int data) {
		this.data=data;
		count++;
	}
	
	public void print() {
		System.out.println("Data: "+ data);
		System.out.println("Count: "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo d1=new StaticDemo(100);
		d1.print();
		StaticDemo d2=new StaticDemo(200);
		d2.print();
		StaticDemo d3=new StaticDemo(300);
		d3.print();
		
		

	}

}
