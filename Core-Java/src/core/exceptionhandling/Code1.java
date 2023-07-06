package core.exceptionhandling;

public class Code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10;
			int b = 0;
			System.out.println(a/b);
		}
		catch(ArithmeticException | IndexOutOfBoundsException e) {
			System.out.println(e.getClass()+"  "+e.getMessage());
			return;
		}
		catch(Exception e) {
			System.out.println(e.getClass()+"  "+e.getMessage());
		}
		finally {
			System.out.println("Finally");
		}
	}
}
