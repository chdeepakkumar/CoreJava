package core.abstractclass;

public abstract class Parent { 
	// If we want abstract methods in a class then we have to declare the class abstract
	// It is not mandatory to have abstract methods in abstract class
	// We can NOT create objects of abstract classes
	// Abstract methods can NOT be static as we have to override them 
	// and we can't override static methods
	
	public abstract void testMethod1();
	public abstract int testMethod2(int a, int b);
	
	public void method1() {
		System.out.println("Concrete method");
	}
}
