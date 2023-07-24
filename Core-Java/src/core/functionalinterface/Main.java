package core.functionalinterface;

import java.util.function.Function;

public class Main {
	// Anonymous class is a class without a name
	// Anonymous class applies for all types of interfaces

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuncInterface fi1 = new FuncInterfaceImpl();
		int fi1Ans = fi1.calc(10, 20);
		System.out.println(fi1Ans);
		
		// Anonymous class
		FuncInterface fi2 = new FuncInterface() {
			@Override
			public int calc(int a, int b) {
				return a-b;
			}
		};
		int fi2Ans = fi2.calc(10, 20);
		System.out.println(fi2Ans);
		
		// Lambda functions work only for functional interfaces
		// If the implementation has only one statement which is return statement then
		// we don't need curly braces
		FuncInterface fi3 = (a, b) -> a*b;
		int fi3Ans = fi3.calc(10, 20);
		System.out.println(fi3Ans);
		
		FuncInterface fi4 = (a, b) -> a/b;
		int fi4Ans = fi4.calc(10, 20);
		System.out.println(fi4Ans);
		
		Function<Integer, Integer> factorial = num -> {
			int ans = 1;
			for(int i=1;i<=num;i++)
				ans = ans*i;
			return ans;
		};
		
		System.out.println(factorial.apply(5));
		
		ArgsFuncInterface<String> append = (arr) -> {
			String ans = "";
			for(String str: arr)
				ans += str+" ";
			return ans;
		};
		System.out.println(append.solve("abcd", "xyz", "pqrs", "jofoh", "sojo"));
	}

}
