import com.ibm.emp.Employee;
import com.ibm.emp.Manager;
import com.ibm.stock.Executive;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager m1=new Manager("Axxx",300000,10000);
		m1.printPayslip();
		System.out.println(m1.getSalary());
		
		Executive ex1 = new Executive("Ram",4000,700);
		ex1.printPayslip();
		System.out.println(ex1.getSalary());
		
		Employee emp = m1;
		System.out.println("Salary: "+ emp.getSalary());
	
		showsalary(ex1);
		showsalary(m1);
		

	}
//polymorphism 
	private static void showsalary(Employee e1) {
		// TODO Auto-generated method stub
		if(e1 instanceof Manager)
			System.out.println("Manager salary "+e1.getSalary());
		else
			System.out.println("Executive Salary "+ e1.getSalary());
	}
}
//overloading
//	private static void showsalary(Executive ex1) {
//		// TODO Auto-generated method stub
//		System.out.println("Executive salary: "+ex1.getSalary());
//		
//	}
//
//	private static void showsalary(Manager m1) {
//		// TODO Auto-generated method stub
//		System.out.println( "Manager Salary: "+m1.getSalary());
//	}
//
//}
