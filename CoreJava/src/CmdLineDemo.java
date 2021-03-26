
public class CmdLineDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(String arg : args) {
			//System.out.println(arg);
		//}
		int sum = 0;
		for ( String num : args ) {
			sum += Integer.parseInt( num );
			
		}
		System.out.println( sum );
		
		int x = 10;			
		Integer xo = x;		//Boxing
		Integer xc = 50;		
		
		int total = x+xo+xc;  //unboxing
		System.out.println(total);	
	}
		
}
