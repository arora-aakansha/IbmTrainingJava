import com.ibm.lib.Book;
import com.ibm.lib.LibraryException;
import com.ibm.lib.Member;

public class TestLibrary {
	public static void main(String[] args) {
		Book bk = new Book(1234, "The Alchemist");
		Member m = new Member(8090 , "xyz");
		bk.status();
		m.status();
		try {
			bk.issueBook(m);
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bk.status();
		m.status();
		try {
			bk.returnBook(m);
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
			//System.out.println(e);
		}
		
		bk.status();
		m.status();
		try {
			bk.returnBook(m);
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
