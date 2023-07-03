package core.polymorphism;

public class Circle extends Shape {
	private int radious;
	
	private static final float PI = 3.141F;

	public Circle(int sidesCount) {
		super(sidesCount);
		this.radious = 10;
	}
	
	
	public int getRadious() {
		return radious;
	}



	public void setRadious(int radious) {
		this.radious = radious;
	}
	
	



	public float getPerimeter(int radious) {
		return 2*PI*radious;
	}
	
	@Override
	public float getPerimeter() {
		super.getPerimeter();
		System.out.println("In Child");
		return 2*PI*radious;
	}
	@Override
	public void display() {
		System.out.println("Circle class");
	}
}
