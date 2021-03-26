

public class EmailValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email="aakansha@gmail.com";
		int iat=email.indexOf("@");
		int idot=email.indexOf(".");
		
		if(iat >3 && email.lastIndexOf('@')==iat && email.lastIndexOf('.')==idot && idot>iat+3 && email.length()>idot+2 ) {
			System.out.println("valid");
		}
		else {
			System.out.println("invalid");
		}
		}
}
