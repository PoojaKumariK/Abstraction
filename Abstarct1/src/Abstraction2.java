

abstract class Bike
{
	Bike()
	{
		System.out.println("non-argument constructor");
	}
	abstract void run();
	
	void gear()
	{
		System.out.println("applyting breaks!..");
	}
}

class Honda extends Bike
{
	void run()
	{
		System.out.println("abstract method implementation in child class");
	}
}
public class Abstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Honda();//we cannot create object for the abstract class 
		b.run();
		b.gear();

	}

}
