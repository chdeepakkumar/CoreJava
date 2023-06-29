package core.encapNabs;

public class Code2 {
	// Abstraction : Exposing only relevant information outside the class
	// Exposing "what" and hiding "how"
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(101, 9, "Pqrs", "Mnop St", new int[] {91,87,78,84,80});
		
		System.out.println(s1.calculatePercentage());
	}

}
