package my.basics.program;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start=10,end=21;
		for(int i=start;i<end;i++) {
			for(int j=1;j<11;j++) {
				System.out.println(i+ "*" +j+ "="+i*j);
			
			}
			System.out.println();
			
		}

	}

}
