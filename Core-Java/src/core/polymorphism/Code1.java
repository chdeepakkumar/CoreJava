package core.polymorphism;

public class Code1 {
	
	// Polymorphism -> Having multiple copies of methods and constructors
	// Static (Overloading) 
	// Dynamic (Overriding)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c1 = new Circle(100000000);
//		System.out.println(c1.getPerimeter());
		
		Shape c2 = new Circle(4);
		// Dynamic binding
		// It creates a Circle object and store it in Shape reference
		// It will have access to all Shape class methods and overridden methods of Circle class
		System.out.println(c2.getPerimeter());
		c2.display();
		
		c2 = new Triangle(4);
		c2.getPerimeter();
		System.out.println("-----------------------------------");
		Rectangle r1 = new Rectangle();
		System.out.println("-----------------------------------");
		B b = new B();
		System.out.println(b.getX());
	}

}
