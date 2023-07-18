package core.abstractclass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Parent p1 = new Parent(); Error as Parent class is Abstract\
		Child1 c1 = new Child1();
		c1.testMethod1();
		Parent c2 = new Child1();
		c2.testMethod1();
		Parent c3 = new Child2();
		c3.testMethod1();
	}

}
