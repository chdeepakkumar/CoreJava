package core.classes;

import java.util.Arrays;

public class Code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] subjects = {"Math", "Science", "English", "History"};
		Student st1 = new Student(1, "Abcd", 5, subjects);
		Student st2 = new Student(2, "Efgh", 5, subjects);
		Student st3 = new Student(3, "Ijkl", 5, subjects);
		
		Student[] students = {st1, st2, st3};
		
		School school = new School();
		school.id = 1;
		school.name = "Xyz School";
		school.students = students;
		
		school.displaySchoolInfo();
		
		School school2 = new School();
		school2.id = 2;
		school2.name = "Pqr School";
		school2.students = new Student[] {new Student(100, "Qwerty", 4, subjects), 
											new Student(101, "Asdfg", 5, subjects)};
		
		school2.displaySchoolInfo();
	}

}



class Student {
	private Integer id, std;
	String name;
	String[] subjects;
	
	public Student() {
		// This is a default cons.
		id = 0;
		name = "";
		std = 0;
		subjects = new String[] {"Math", "Science", "English", "History"};
	}
	public Student(Integer ID) {
		// This is a parameterized cons.
		id = ID;
		name = "";
		std = 0;
		subjects = new String[] {"Math", "Science", "English", "History"};
		
	}

	public Student(Integer ID, String name, Integer std, String[] subjects) {
		// This is a parameterized cons.
		id = ID;
		this.name = name;
		this.std = std;
		this.subjects = Arrays.copyOf(subjects, subjects.length);
	}
	
	public String getInfo() {
//		String subArray = 
		return String.format("Id: %d\nName: %s\nStd: %d\n", this.id, this.name, this.std);
	}
}

class School {
	Integer id;
	String name;
	Student[] students; // Every school object has an array of students
	
	public void displaySchoolInfo() {
		System.out.println("Id: "+this.id);
		System.out.println("Name: "+this.name);
		System.out.println("Students Information");
		for(Student student: this.students) {
			System.out.println(student.getInfo());
		}
	}
	
	
	
}