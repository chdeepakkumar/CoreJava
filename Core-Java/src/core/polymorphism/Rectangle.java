package core.polymorphism;

public class Rectangle extends Quadrilateral {
	
	public Rectangle() {
		System.out.println("Rectangle cons.");
	}

	public Rectangle(int sidesCount) {
		super(sidesCount);
	}

}
