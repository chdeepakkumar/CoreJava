package core.polymorphism;

public class Shape {
	
	// Overloading
	// 1. Same name
	// 2. Different 
	//    2.1. No. of arguments
	//	  2.2. Types of arguments
    //    2.3. Order of arguments
	private int sidesCount;
	private int[] sides;
	
	public Shape(int sidesCount, int[] sides) {
		super();
		this.sidesCount = sidesCount;
		this.sides = sides;
	}
	
	public Shape(int sidesCount) {
		super();
		System.out.println("Shape cons.");
		this.sidesCount = sidesCount;
		this.sides = new int[sidesCount];
	}

	public int getSidesCount() {
		return sidesCount;
	}

	public void setSidesCount(int sidesCount) {
		this.sidesCount = sidesCount;
	}
	
	public float getPerimeter() {
		
		System.out.println("In Parent");
		int perimeter = 0;
		for(int side: sides)
			perimeter += side;
		return perimeter;
	}
	
	public void display() {
		System.out.println("Shape class");
	}
}
