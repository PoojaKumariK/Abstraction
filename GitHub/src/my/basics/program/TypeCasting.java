package my.basics.program;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//widening /implicit type casting :
				byte myint=127;
				int mybyte = myint;
				System.out.println(mybyte);
				
				System.out.println(myint);
				
				float fi=12.0f;
				double my = fi;
				System.out.println(my);
				
				char ch ='A';
				int i3 = ch;
				System.out.println(i3);
				
				char var1 ='\u00A7';
				int i4 = var1;
				System.out.println(i4);

				//narrowing explicit type casting:
				double l =10.783;
				long as = (long)l;
				System.out.println(as);
				
				char ch2='A';
				int d = ch2;
				System.out.println(d);
				
				
				byte b1 = 90;
				char chw = (char)b1;
				System.out.println(chw);

	}

}
