package core.inheritance;

public class MechanicalEngineer extends Engineer {
	private String[] tools;
	

	public MechanicalEngineer(String[] tools) {
		this.tools = tools;
		this.setLevel(6);
	}

	/**
	 * @return the tools
	 */
	public String[] getTools() {
		return tools;
	}

	/**
	 * @param tools the tools to set
	 */
	public void setTools(String[] tools) {
		this.tools = tools;
	}
	
	
}
