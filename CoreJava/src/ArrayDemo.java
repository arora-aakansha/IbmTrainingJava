
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] jag= {{1,2},{1,2,3},{1,2,3,4,5}};
		for(int i=0;i<jag.length;i++) {
			for(int j=0;j<jag[i].length;j++) {
				System.out.print(jag[i][j]+ " \t");
			}
			System.out.println();
		}

	}

}
