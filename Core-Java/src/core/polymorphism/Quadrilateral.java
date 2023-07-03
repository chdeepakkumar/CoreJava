package core.polymorphism;

public class Quadrilateral extends Shape {
	
	
	
	public Quadrilateral() {
		super(4);
		System.out.println("Quadrilateral cons.");
	}

	public Quadrilateral(int sidesCount) {
		super(sidesCount);
	}

}
