package com.ibm.stock;
public class CheckConverter {

public static void main(String[] args) {
	

		USD u = new USD();
		Rupee r = new Rupee();
		CurrencyConverter cc= new CurrencyConverter();
		double ans = cc.convert(u, r, 100);
		System.out.println(ans);
		
		
		
	}
}


