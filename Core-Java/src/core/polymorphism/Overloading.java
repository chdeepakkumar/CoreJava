package core.polymorphism;

public class Overloading {
	
	// Overloading
	// 1. Same name
	// 2. Different 
	//    2.1. No. of arguments
	//	  2.2. Types of arguments
    //    2.3. Order of arguments
	
	public static int add(int a, int b) {
		return a+b;
	}
	
//	public static float add(int a, int b) {
//		return a+b;
//	}
	
	public static int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public static int add(int[] arr) {
		int sum = 0;
		for(int i: arr)
			sum += i;
		return sum;
	}
	
	public static float add(float a, float b) {
		return a+b;
	}
	
	public static float add(int a, float b) {
		return a+b;
	}
	
	public static float add(float a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(4,5);
	}

}
