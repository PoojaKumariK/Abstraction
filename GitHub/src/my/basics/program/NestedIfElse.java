package my.basics.program;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100,b=20000,c=300;
		System.out.println("the largest number is:");
		if((a>b)&&(a>c))
		{
			System.out.println("a is greater"+a);
		}
		else if((c>a)&&(c>b))
		{
			System.out.println("c is greater:"+c);
		}
		else {
			System.out.println("b is greater: "+b);
		}

	}

}
