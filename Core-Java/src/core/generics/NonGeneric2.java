package core.generics;

public class NonGeneric2  extends NonGeneric {
	private Integer deptId;
	private String deptName;
	private String managerName;
	private Integer managerId;
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	@Override
	public String toString() {
		return "NonGeneric2 [deptId=" + deptId + ", deptName=" + deptName + ", managerName=" + managerName
				+ ", managerId=" + managerId + "]";
	}
	
	
}
