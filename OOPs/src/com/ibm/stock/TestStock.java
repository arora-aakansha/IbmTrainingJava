package com.ibm.stock;
import javax.xml.ws.Holder;

public class TestStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock s = StockSingleton.getStock();
		s.view();
		s.get();
		s.set();
				
	}

}
