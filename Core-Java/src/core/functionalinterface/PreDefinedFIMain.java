package core.functionalinterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PreDefinedFIMain {

	public static void main(String[] args) {
		// Takes one input of any type and returns boolean
		Predicate<Integer> oddEvenCheck = (num) -> num%2==0;
		System.out.println(oddEvenCheck.test(25));
		
		// Takes one input of any type and return a response of any type
		Function<Integer, String> oddEven = num -> num%2==0?"Even":"Odd";
		System.out.println(oddEven.apply(24));
		
		Consumer<String> print = str -> System.out.println(str);
		print.accept("Hello world!!");
		
		Supplier<String> supp = () -> "I'm a supplier";
		System.out.println(supp.get());
	}

}
