package core.operators;

public class Code3 {

	// 3. Ternary -> ?:
	//(condition)?(true):(false);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 9, y = 18;
		int z = x<y?1:2; // 1;
		System.out.println(z); // 1
		z = x>=y?(x==y?1:2):(2*x==y)?3:4; // 3;
		System.out.println(z); // 3
		if(x>=y) {
			if(x==y)
				z = 1;
			else
				z = 2;
		} 
		else {
			if(2*x == y)
				z = 3;
			else
				z = 4;
		}
	}

}
