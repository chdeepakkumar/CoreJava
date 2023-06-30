package core.inheritance;


// Inheritance - Establishing "Is a" relation

// Single, Multilevel, Hierarchical (O)
// Multiple                         (X)

// Parent -> Child (Single)
// Parent -> Child -> Grand-child (Multilevel)
// Parent -> Child1
//        -> Child2 (Hierarchical) 
// Parent1
// Parent2 -> Child (Multiple)

public class Code1 {
	public static void main(String[] args) {
		Engineer e1 = new Engineer(100, "Tom", "9876543210", "Bengaluru");
		e1.setLevel(4);
		
		System.out.println(e1.getSalary());
		
		SoftwareEngineer se1 = new SoftwareEngineer(101, "Jerry", "1234567890", "Delhi", new String[] {"java", "Python", "C++"});
		
//		se1 = new MechanicalEngineer(new String[] {"CAD", "MATLAB"}); // C Error
		
		System.out.println(se1.getSalary());
		System.out.println(se1.getId());
		System.out.println(se1.calc());
		System.out.println(se1.getAddress());
		
		Engineer me1 = new MechanicalEngineer(new String[] {"CAD", "MATLAB"}); // Dynamic binding
		
//		MechanicalEngineer me2 = new Engineer(100, "Tom", "9876543210", "Bengaluru"); // Compilation error
		
		me1.getSalary();
		
		me1 = new SoftwareEngineer(101, "Jerry", "1234567890", "Delhi", new String[] {"java", "Python", "C++"});
	}
}