package core.oops;

public class StaticBlock {
	
	public static String username, pwd;
	
	static {
		System.out.println("Static Block");
		resetConf("root", "root");
	}
	
	public StaticBlock() {
		System.out.println("Static Block Constructor");
	}
	
	public static void resetConf(String username, String pwd) {
		StaticBlock.username = username;
		StaticBlock.pwd = pwd;
	}
}
