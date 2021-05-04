package ex01;

public class SystemEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.home"));
		
		System.out.println(System.getProperty("java.version"));
		
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println(javaHome);
	}

}
