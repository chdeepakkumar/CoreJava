package core.oops;

public class Dog extends Animal {
	
	private static String constant = "DogConstant";
	
//	@Override
	public static String getConstant() {
		return constant;
	}
	
	@Override
	public String toString() {
		return "Dog [name=" + getName() + "]";
	}

}
