
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";
		String s2 =new String("Hello");
		String s3="Hello";
		
		//comparing addresses not value
		System.out.println(s1==s3);
		System.out.println(s1==s2);
		
		s1=s1+" World";
		
		System.out.println(s1==s3);
		System.out.println(s1==s2);
		
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('o'));
		System.out.println(s1.charAt(5));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 5));
		System.out.println(s1.replace('o','a'));
		System.out.println(s1);
		
		String week="sun-sat-mon-tue-wed-thur-fri-sat-sun";
		String[] modifiedweek=week.split("-");
		for(int i=0;i<modifiedweek.length;i++) {
			System.out.println(modifiedweek[i]);
		}
		

	}

}
