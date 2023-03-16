
abstract class Shapes{
	
	abstract void  draw();
	
}

class Rectangle extends Shapes{
	
	void draw()
	{
		System.out.println("drawing rectangle");
	}
}

class Circle extends Shapes{
	void draw()
	{
		System.out.println("drawing circle");
	}
}
public class Abstract3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shapes s1 = new Rectangle();
		s1.draw();
		Shapes s2 = new Circle();
		s2.draw();
				

	}

}
