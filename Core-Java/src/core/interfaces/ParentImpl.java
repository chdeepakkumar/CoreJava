package core.interfaces;

public class ParentImpl implements Parent1, Parent2 {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int method2(int a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int method2() {
		System.out.println("Common Method");
		return 0;
	}

	@Override
	public String defaultMethod() {
		// TODO Auto-generated method stub
		return null;
	}

}
