package core.interfaces;

public class Main {
	int x = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentImpl p1 = new ParentImpl();
		p1.method2();
		
		Parent1 pI1 = new ParentImpl();
		pI1.method2();
		
		Parent2 pI2 = new ParentImpl();
		pI2.method2();
		
		Parent1 pI11 = new Parent1Impl();
		pI11.method2();
		
		Parent2 pI21 = new Parent2Impl();
		pI21.method2();
	}

}
