package core.interfaces;

public interface Parent2 {
	
	public int method2();
	
	static int staticMethod() {
		return 20;
	}
	
	default String defaultMethod() {
		return "Parent2 DM";
	}
}
