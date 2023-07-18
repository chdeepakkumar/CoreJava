package core.exceptionhandling;

import java.io.IOException;

public class Code2 {
	
	public static int divide(Integer a, Integer b) throws CustomException, NullPointerException {
		if(a == null || b == null)
			throw new NullPointerException("Parameters can not be null");
		if(a<0 || b<0)
			throw new CustomException("Don't divide by negative numbers");
		return a/b;
	}
	
	public static int multiply(Integer a, Integer b) throws CustomException, NullPointerException {
		if(a == null || b == null)
			throw new NullPointerException("Parameters can not be null");
		if(a<0 || b<0)
			throw new CustomException("Don't divide by negative numbers");
		return a*b;
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			System.out.println(divide(10, null));
			System.out.println(multiply(10, -2));
		} catch (CustomException e) { // catch is used to not stop the code execution
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println(multiply(10, 2));
		} catch (NullPointerException e) { // catch is used to not stop the code execution
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println(multiply(10, 2));
		} finally {
			System.out.println("Finally block");
		}
		System.out.println("After finally");
	}

}
