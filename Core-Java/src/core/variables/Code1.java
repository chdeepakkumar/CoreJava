package core.variables;

public class Code1 {
	
	private String var1;
	private static String var2 = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2 types
		// 1. Primitive (int, long, float, double, byte, short etc.)
		// 2. Non-Primitive (String, Integer, Double, Float, all user defined classes etc. )
		
		// For storing number
		byte x = 0; //-2^8 to 2^8-1 - It takes 1 byte space
		short y = 0; // -2^16 to 2^16-1 - It takes 2 bytes space
		int z = 0; // -2^32 to 2^32-1 - It takes 4 bytes space
		long a = 0L; // -2^64 to 2^64-1 - It takes 8 bytes space 
		
		// For decimal number
		float b = 273.43F; // 4 bytes space
		double c = 63.453D; // 8 bytes space
		
		// for character
		char d = 'a';
		
		// For boolean
		boolean e = true;
		
		// For string
		String s = "abcd"; // Stored directly in the scp
		String t = "abcd";
		Integer f = 10;
		
		String s1 = new String("abcd");
		String s2 = new String("abcd");
		
		System.out.println(s1 == s2); // False
		System.out.println(s == t); // True
		System.out.println(s1 == s); // False
		System.out.println(t == s2); // False
		System.out.println("_________________________");
		
		System.out.println(s1.equals(t));
		System.out.println(s1.equals(s2));
		System.out.println(s.equals(t));
		
		
		s = s+"ef";
		System.out.println(s.charAt(3)); // False
		System.out.println(s.concat("xyz"));
		
	}

}
