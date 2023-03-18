package my.basics.program;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int k=1; k<20;k++) {
			if (k%2!=0)//odd number is skipped:
				continue;
			System.out.println(k);//print even number:
		}

	}

}
