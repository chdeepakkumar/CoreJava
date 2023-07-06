package core.oops;

import java.util.Objects;

public class Animal {
	private String name;
	
	private static String constant = "AnimalConstant";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static String getConstant() {
		return constant;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}
	
	public int getLimbsCount() {
		return 4;
	}
	
	
	
//	@Override
//	public String toString() {
//		return "Animal: "+this.name;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		Animal animal = (Animal)obj;
//		if(animal == this)
//			return true;
//		if(animal.getName() == this.getName())
//			return true;
//		else
//			return false;
//	}
//	
//	@Override
//	public int hashCode() {
//		return this.name.hashCode();
//	}
	
	
}
