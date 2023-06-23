package core.controlflow;

public class Code1 {
	
	// Control flow
	// 1. if-else
	// 2. switch-case

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* if(condition<boolean>) {
		 * .....
		 * .....
		 * }
		 * else if(condition<boolean>) {
		 * .....
		 * .....
		 * }
		 * else {
		 * .....
		 * .....
		 * }
		*/
		String s = "abcd";
		String t = "abcd";
		if(s.compareTo(t) != 0) {
			System.out.println("S and T are equal");
			if(s.equals("abcd")) {
				System.out.println("Value of S: "+s);
			}
			int x = 10;
		}
		else if(s.contains("ef")) {
			System.out.println("S contains ef");
		}
		else if(s.contains("cd"))
			System.out.println("S contains cd");
		else if(s.contains("ab"))
			System.out.println("S contains ab");
	}

}
