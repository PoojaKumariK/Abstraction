package my.basics.program;

public class OperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10 ,b=20, x=10 ;
		System.out.println("a and b values before the operation: "+a+ " "+b);
		++a;
		int c=++a + b + a--;
		System.out.println("c value after the operation: "+c);
		
		
		int d = c++ + a + b--;
		System.out.println("d value after the operation: "+d);
		
		//ternary operator demonstration:
		x=(10==x)? 1:0;
		System.out.println(x);
		

	}

}
