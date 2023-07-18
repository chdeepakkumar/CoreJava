package core.exceptionhandling;

public class Code3 {
	// final, finally, finalize
	// final - Declaring constants (1 time initialization)
	// finally - For executing after try catch block
	// finalize - Executing something just before unloading from memory
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Code3 a = new Code3();
		final int x;
		x = 10;
		System.gc();
	}
	
	@Override
	public void finalize() {
		System.out.println("Finalize method");
	}

}
