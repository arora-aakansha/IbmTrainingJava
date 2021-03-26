package com.ibm.xe;
public class ShoppingCart {
	private double cart_total;
	private Product[] items;
	private int index;
	
	String[][] coupons = {{"Holi200","200"},{"Diwali400","400"},{"WKND100","100"}};
	
	public ShoppingCart() {
		// TODO Auto-generated constructor stub
		items = new Product[5];
	}
	
	
	public void addProduct(Product p) throws OutOfStockException {
		if(p.getStock()<=0)
			throw new OutOfStockException("Product out of stock");
		if(index <= items.length) {
			cart_total += p.getPrice();
			items[index++]=p;
			p.setStock(p.getStock()-1);
		}else
			System.out.println("Your cart is full");
	}
	
	public void checkOut(Payment amt, String code) throws NotAmortizeException {
		if(index ==0)
			System.out.println("your cart is empty");
		System.out.println("Items:");
		for(int i =0; i<index;i++) {
			System.out.println(items[i].getName());
		}
		System.out.println("Total: "+cart_total);

		if(code!=null) {
			for(int i=0;i<coupons.length;i++) {
				if(coupons[i].equals(code)) {
					cart_total =- Double.parseDouble(coupons[i][1]);
				}
			}
			if(amt.getBalance()<cart_total)
				throw new NotAmortizeException("Balance is too Low, payment failed");
			else {
				amt.setBalance(amt.getBalance()-cart_total);
				System.out.println("Payment successful");
				
			}
				
		}
	}

	

}
