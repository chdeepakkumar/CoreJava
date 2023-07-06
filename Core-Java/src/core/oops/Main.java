package core.oops;

class A {
	
	public int fun(int x, int y) {
		System.out.println(x+y);
		return x+y;
	}
}


class B extends A {
	
	public void fun(int... x) {
		return;
	}
}


class Main {
	
	public static void checkType(Object... arr) {
		int n = arr.length;
		if(n == 0) {
			System.out.println("No Input");
		}
		else {
			for(Object i: arr) {
				System.out.println(i.getClass());
			}
		}
	}
	
	public static void main(String... args) {
		B b = new B();
		
		checkType(10, "Test", 'C', 20.4, b);
	}
}
