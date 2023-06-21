package core.strings;

public class Code1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		String t = "abcd";
		
		System.out.println(s.substring(0, 2) + "xy" + s.substring(2));
		
		String s1 = new String(); // ""
		String s2 = null; // null
		
		System.out.println("Value of s1 :  " + s1);
		System.out.println("Value of s2 :  " + s2);
		
//		s = s+t;
//		s = s.concat(t);
		char[] arr = s.toCharArray(); // {'a', 'b', 'c', 'd'}
		System.out.print("Value of arr: ");
		System.out.println(arr);
		
		int[] arr1 = {1,2,3,4};
		
		String x = new String(arr);
		System.out.println(x);
		System.out.println(x.getBytes()[0]); // {97, 98, 99, 100}
		
		// A-Z = 65-90
		// a-z = 97-122
		// 0-9 = 48-57
		
		String str = "abcdefghijklmnopefgh";
		System.out.println(str.substring(3)); // defghijklmnop
		System.out.println(str.substring(3,6)); // def
		
		System.out.println(str.contains("efgi")); // false
		
		System.out.println(str.indexOf("efgh")); // 4
		System.out.println(str.lastIndexOf("efgh")); // 16
		
		System.out.println(str.replace("efgh", "xyz"));
		
		System.out.println(str.charAt(2));
		str.concat("xyz");
		System.out.println(str);
		
		StringBuffer sBuff = new StringBuffer(str); // "abcdefghijklmnopefgh"
		StringBuilder sBuld = new StringBuilder(str); // "abcdefghijklmnopefgh"
		
		sBuff.append("xyz");
		sBuff.insert(2, "xy");
		System.out.println(sBuff);
		
		
		// Type casting/conversion
		// Implicit & Explicit
		
		byte x1 = 127; //-2^8 to 2^8-1 - It takes 1 byte space
		short y = 1000; // -2^16 to 2^16-1 - It takes 2 bytes space // 0000001101101000
		int z = 0; // -2^32 to 2^32-1 - It takes 4 bytes space //2134
		long a = 0L; // -2^64 to 2^64-1 - It takes 8 bytes space 
		System.out.println("--------------------------------");
		short srt = (short) x1;
		
		System.out.println(srt);
		
		byte byt = (byte) y; // 11101000 //00010111
		// 00010111
		//        1
		//----------
		//     11000 
		
		System.out.println(byt);
		System.out.println((double)5/3);
		
		// Type var1 = (Type) var2
		
		
	}

}
