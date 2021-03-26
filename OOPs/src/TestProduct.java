import com.ibm.xe.NotAmortizeException;
import com.ibm.xe.OutOfStockException;
import com.ibm.xe.Payment;
import com.ibm.xe.Product;
import com.ibm.xe.ShoppingCart;

public class TestProduct {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Product p = new Product("A",100,4);
//		Product p1 = new Product("B", 100);
//		Product p2 = new Product("c", 100);
//		Product p3 = new Product("d", 100);
//		Product p4 = new Product("e", 100);
		Payment pay =new Payment(1234,5);
		
		ShoppingCart sc = new ShoppingCart();
		try {
			sc.addProduct(p);
		} catch (OutOfStockException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
//		sc.addProduct(p1);
//		sc.addProduct(p3);
//		sc.addProduct(p4);
//		sc.addProduct(p2);
		try {
			sc.checkOut(pay,"Holi200");
		} catch (NotAmortizeException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
