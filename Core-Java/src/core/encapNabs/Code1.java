package core.encapNabs;

public class Code1 {
	
	// Encapsulation - Wrapping up related information together in a class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(100, 7, "Abcd", "Xyz St.", new int[] {70,89,54});
		s1.setStd(10);

	}

}

class Student {
	
	// Access specifiers : public, protected, default, private
	
	//                        Public     Protected      Default       Private
	// Same class               O            O            O              O
	// Child - Same Package     O            O            O              X
	// Child - Diff Package     O            O            X              X
	// Non-Child - Same/Diff    O            X            X              X
	
	private Integer id, std;
	private String name, address;
	private int[] marks;
	
	public Student(Integer id, Integer std, String name, String address, int[] marks) {
		this.id = id;
		this.std = std;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getStd() {
		return this.std;
	}
	
	public void setStd(Integer std) {
		this.std = std;
	}
	
	public double calculatePercentage() {
		int n = this.marks.length;
		int sum = 0;
		for(int mark : this.marks) 
			sum += mark;
		double total = n*100.0;
		return addExtra((sum/total)*100);
	}
	
	private double addExtra(double percentage) {
		return percentage+5;
	}
}
