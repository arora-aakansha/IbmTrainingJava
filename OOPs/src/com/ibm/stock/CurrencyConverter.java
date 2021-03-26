package com.ibm.stock;
public class CurrencyConverter {

	public double convert(Currency source, Currency target, double amount) {
		double rate = source.dollarValue()/target.dollarValue();
		return rate * amount;
	}






	
	

}
