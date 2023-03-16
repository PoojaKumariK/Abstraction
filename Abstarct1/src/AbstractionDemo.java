

abstract class Animal
{
	abstract void animalSound();
	
	void run()
	{
		System.out.println("Animal ran away!...");
	}
}

class Pig extends Animal
{
	void animalSound()
	{
		System.out.println("pig sounds: wee wee");
	}
}

public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pig p = new Pig();
		//Animal p = new Pig();
		p.animalSound();
		p.run();

}
}
