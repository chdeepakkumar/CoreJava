package core.functionalinterface;

@FunctionalInterface
public interface FuncInterface {
	// A functional interface must have only one abstract methods
	// All other properties are same as an usual interface
	
	public int calc(int a, int b);
}
