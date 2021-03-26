import OTT.PaymentException;
import OTT.Subscription;
import OTT.User;

public class TestMedia {
	public static void main(String[] args) {
		User u =new User("a", 15, 3000);
		u.profile();
		Subscription s = new Subscription();
		try {
			s.subscribe(u, "Monthly");
		} catch (PaymentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		u.profile();
		u.mySubscription();
	}

}
