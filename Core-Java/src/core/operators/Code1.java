package core.operators;

public class Code1 {

	//TYPES:
	// 1. Unary
	// 2. Binary
	// 3. Ternary
	
	
	// 1. Unary -> ++, --, !
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		x++; // Post Increment
		System.out.println(x); // 11
		++x;// Pre Increment
		System.out.println(x); // 12
		
		x--; // Post Decrement
		System.out.println(x); // 11
		--x;// Pre Decrement
		System.out.println(x); // 10
		
		int y = ++x; // Increment then assign
		System.out.println(x + "    " + y); // 11    11
		y = x++; // Assign then increment
		System.out.println(x + "    " + y); // 12    11
		System.out.println(++x*5 + "    " + x); // 65 and x=13
		System.out.println(x++*5 + "    " + x); // 65 and x=14
		
		int z = --x;
		System.out.println(x + "    " + z); // 13    13
		z = x--;
		System.out.println(x + "    " + z); // 12    13
		
		boolean b = false;
		System.out.println(!b);
		System.out.println(!(5==10));
	}

}
