package core.loops;

public class Code1 {
	
	// 3 types
	// While
	// do-while
	// for

	// 1. while
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * while(condition<boolean>) {
		 * .....
		 * .....
		 * .....
		 * }
		 */
		int i=0;
		String s = "", t = "abcdefghij";
		while(i<0) {
			while(!s.equals(t)) {
				s += (char)('a'+i);
				i++;
				if(s.length()%2 == 0) 
					break;
				System.out.println(s);
			}
			System.out.println(i);
			break;
		}
		System.out.println("Outside loop");
	}

}
