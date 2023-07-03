package core.polymorphism;

public class Triangle extends Shape {
	private int a,b,c;
	

	public Triangle(int a, int b, int c) {
		super(3, new int[] {a,b,c});
		this.a = a;
		this.b = b;
		this.c = c;
	}


	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public int getC() {
		return c;
	}


	public void setC(int c) {
		this.c = c;
	}


	public Triangle(int sidesCount) {
		super(sidesCount);
	}
	
	
	public float getPerimeter() {
		System.out.println("In Triangle");
		return a+b+c;
	}
}
