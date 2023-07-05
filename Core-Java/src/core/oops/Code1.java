package core.oops;

public class Code1 {
	
	// 4 oops concepts
	// 1. Encapsulation - Wrapping-up similar information in class (capsul)
	// 2. Abstraction - Revealing only the required information (the methods, variables) 
	// 3. Inheritance - Creating parent-child relation between classes ("Is a" relation)
	// 4. Polymorphism - Creating multiple copies of same methods and constructors
	
	static {
		System.out.println("Static Block of Code 1");
	}
	
	public static void main(String[] args) {
		System.out.println("1st line of main method");
		Animal cat1 = new Animal();
		cat1.setName("Cat");
		Animal cat2 = new Animal();
		cat2.setName("Cat");
		String s1 = "Test";
		String s2 = new String("Test");
		System.out.println(s1);
		System.out.println(s1.equals(s2));
		System.out.println(cat1); // O/P = based on implementation of toString method in the class
		// If toString method is not implemented it prints memory address
		System.out.println(cat1.equals(cat2));
		Animal dog1 = new Animal();
		dog1.setName("Dog");
		System.out.println(cat1.equals(dog1));
		
		System.out.println(dog1.hashCode());
		
		System.out.println(cat1.hashCode());
		System.out.println(cat2.hashCode());
		
		//_______________________________________________________________________//
		
		System.out.println("___________________________________________________________");
		Animal horse = new Animal();
		horse.setName("Horse");
		System.out.println(horse.getConstant());
		
		
		//Static binding
		Dog dog = new Dog();
		dog.setName("Black Dog");
		System.out.println(dog.getConstant());
		
		//Dynamic binding
		Animal dog3 = new Dog();
		dog3.setName("White Dog");
		System.out.println(dog3.getConstant()); // We can NOT override static methods
		
		System.out.println(horse); // Animal [name = Horse]
		System.out.println(dog); // Dog [name = Black Dog]
		System.out.println(dog3.toString()); // Dog [name = White Dog]
		
		/*
		 * Static -> Can NOT be overridden
		 * Dynamic Binding
		 * (Non-static) Non-overridden methods -> Parent
		 * (Non-static) Overridden methods -> Child
		 * Static methods -> Parent
		 */
		
		//_______________________________________________________________________//
		
		System.out.println("___________________________________________________________");
		
		System.out.println("Before Creating obejct");
		StaticBlock sb = new StaticBlock();
		System.out.println("After Creating obejct");
		
		StaticBlock sb1 = new StaticBlock();
		StaticBlock sb2 = new StaticBlock();
	}
	
}
