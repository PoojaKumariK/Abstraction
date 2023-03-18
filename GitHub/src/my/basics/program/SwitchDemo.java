package my.basics.program;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x = 'W';
		switch(x)
		{
		case 'l' : 
		case 'L' :
			System.out.println(x+ " is a letter");
			break;
			
		case 'd' : 
		case 'D' :
			System.out.println(x+ " is a digit");
			break;
			
		case 's' : 
		case 'S' :
			System.out.println(x+ " is a Special Symbolr");
			break;
			
		case 'w' : 
		case 'W' :
			System.out.println(x+ " is a White Space");
			break;
			
		default:
			System.out.println(x+ " is other than a letter ,dogot,space or special sysmbol");
			
		break;
		}

	}

}
