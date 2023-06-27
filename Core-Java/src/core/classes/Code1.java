package core.classes;
// Class is a user defined data-type
// It is blue print of a real life entity

class Code1 {
	
	public static void main(String[] vfg) {
		Employee emp1 = new Employee(); // Default cons. provided by Java
//		emp1.id = 101;
//		emp1.name = "Abcd";
//		emp1.address = "Pqrs St.";
//		emp1.contact = 9876543210L;
		
		Employee.officeAddress = "Xyz St";
		
		Employee emp2 = new Employee(); // Default cons. provided by Java
		emp2.id = 102;
		emp2.name = "Abcde";
		emp2.address = "Pqrst St.";
		emp2.contact = 9876543211L;
		
		Employee.officeAddress = "Mnop St";
		
		System.out.println(emp1.empInfo(10000));
		
	}
}


// Default class
class Employee {
	
	// 1. Variables 
		// 1.1. Instance Variables
		// 1.2. Static Variables
	// 2. Methods
		// 2.1. Instance Methods
		// 2.2. Static Methods
	// Instance Variables - They belong to the instance or object
	public int id;
	public String name, address;
	public long contact;
	
	// Static Variables - They belong to the entire class
	public static String officeAddress;
	
	// Methods - Is to increase code reuseability
	public int empInfo(int salary) {
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("contact: "+contact);
		System.out.println("Rating: "+orgInfo(3.5f));
		return salary+1000;
	}
	
	public static float orgInfo(float rating) {
		System.out.println("Office Address: "+officeAddress);
		return rating*1.1f;
	}
	
	// Constructor
	// 1. default cons.
	// 2. parameterized cons.
	// 3. copy cons.
	
	public Employee() {
		System.out.println("Creating employee");
		id = 100;
		name = "Test";
		address = "Test st.";
		contact = 9876543210L;
	}
	
}
