package core.operators;

public class Code2 {

	// 2. Binary
	// Arithmetic -> =, +, -, *, /, %  // Numeric
	// Bitwise -> &, |, ^, ~, <<, >> // Numeric
	// Comparison ->  >, <, >=, <=, ==, != // Boolean
	// Logical -> &&, ||, ! // Boolean
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5, y = 6;
		int z = x+y; // 11
		z = x-y; // -1
		z = x*y; // 30
		z = x/y; // 0
		System.out.println(z);
		z = x%y;
		System.out.println(z); // 5
		double a = 15.5f, b = 6.3f;
		double c = a/b; // 2.46...
		System.out.println(c);
		c = a%b;
		System.out.println(c); // 2.9
		
		System.out.println("-----------------");
		
		System.out.println(10>8); // True
		System.out.println(10<8); // False
		System.out.println(9>=9); // True
		System.out.println(8<=12); // True
		System.out.println(10==10); // True
		System.out.println(10!=10); // False
		
		System.out.println("-----------------");
		
		System.out.println(10>5 && 10>=12 && 10<12); // False
		System.out.println(10>5 || 10>=12); // True
		
		x = 14;
		y = 12;
		
		// || -> Breaks once it finds a true and returns true
		// && -> Breaks once it finds a false and returns false
		
		System.out.println(x++>y || ++y==--x && x--==y++); // False
		System.out.println(x+ "    " +y); // 14    13
		// 14 13
		
		System.out.println("--------------------");
		
		x = 15; // 1111
		y = 22; // 10110
		
		//         00110 
		//         11111
		//         11001
		//         111111111110000
		
		//0....00001111
		//1....11110000
		//0....00001111
		//            1
		//--------------
		//0...000010000
		
		
		
		
		System.out.println(x&y); // 6
		System.out.println(x|y); // 31
		System.out.println(x^y); // 25
		System.out.println(~x); // -16
		int i = 3;
		System.out.println(x<<i); // 120 // x<<y is x*(2 to the power y)
		System.out.println(x>>i); // 1 // x>>y is x/(2 to the power y)
		
		// 0000000000111100000
		
		// {4^6^1^2^4^3^6^1^3}
		
		//11010101
		//11010101
		
		x+=10; // x = x+10;
		
	}

}
