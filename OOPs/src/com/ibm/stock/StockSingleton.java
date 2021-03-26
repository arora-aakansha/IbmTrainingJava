package com.ibm.stock;

public final class StockSingleton {
	private StockSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	private static Stock s;
	
	public static  Stock getStock() {
		if(s == null)
			s = new Stock();
	 return s;
		}
		
	}


