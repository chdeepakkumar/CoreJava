package core.interfaces;

public interface Parent1 extends GrandParent {
	// Interfaces can NOT have concrete methods (Until java 7)
	// Can NOT create objects of interfaces
	// Interfaces can not implement other interfaces
	// It is NOT mandatory to have abstract methods 
	// From java 8+
	// We can have public static final variables
	// We can have public static and public default methods (By default public)
	// We can NOT have common default method in more than 1 interface 
	// where they act as parent of single class (As it leads to ambiguity)
	// To do so we need to Override the default method in implemented class
	int x = 10;
	public int method2();
	
	static int concreteMethod() {
		return 10;
	}
	
	// Set default implementation of a method
	// Here default is not a access specifier
	public default String defaultMethod() {
		return "Parent1 DM";
	}
}
