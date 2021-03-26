
import com.ibm.bank.AccountFactory;
import com.ibm.bank.Banking;
import com.ibm.bank.balanceException;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

//		Saving s =new Saving("mona");
//		s.Withdraw(34);
//		
//		Current c = new Current("kaka");
//		c.Deposit(5000);
//		c.Summary();
//		c.Withdraw(9000);
//		c.Summary();
		
//		Transaction tnx = new Transaction("DR", 20000, 50000);
//		tnx.print();
		
		Banking s1= AccountFactory.OpenSavingAccount("polo");
		s1.Deposit(3000);
		try {
			s1.Withdraw(20000);
		} catch (balanceException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();  //for debugging/troubleshooting -for developers
			//System.out.println(e); //for system/application audit - logging
			System.out.println(e.getMessage()); //for end users
			
		}
		s1.Deposit(4000);
		s1.statement();
		
		
	}
}