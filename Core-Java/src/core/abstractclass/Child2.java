package core.abstractclass;

public class Child2 extends Parent {

	@Override
	public void testMethod1() {
		// TODO Auto-generated method stub
		System.out.println("Inside Child2 Test Method 1");
	}

	@Override
	public int testMethod2(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Inside Child2 Test Method 2");
		return 0;
	}

	@Override
	public int testMethod2(int a, int b, int c) {
		// TODO Auto-generated method stub
		System.out.println("Inside Child2 Test Method 2");
		return 0;
	}
}
