package core.inheritance;

public class SoftwareEngineer extends Engineer {
	private String[] programmingLangs;
	

	public SoftwareEngineer(int id, String name, String contact, String address, String[] programmingLangs) {
		super(id, name, contact, address);
		this.programmingLangs = programmingLangs;
		this.setLevel(5);
		super.setAddress(address);
		this.setAddress(address);
	}
	
	public void setAddress(String address) {
		super.setAddress(address+"--");
	}

	/**
	 * @return the programmingLangs
	 */
	public String[] getProgrammingLangs() {
		return programmingLangs;
	}

	/**
	 * @param programmingLangs the programmingLangs to set
	 */
	public void setProgrammingLangs(String[] programmingLangs) {
		this.programmingLangs = programmingLangs;
	}
	
	public int getSalary() {
		return super.getSalary()+1000;
	}
	
	public int calc() {
		return this.getSalary()+super.getSalary();
	}
	
}
