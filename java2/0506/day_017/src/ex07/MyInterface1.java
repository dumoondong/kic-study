package ex07;

public interface MyInterface1 {
	void methodA();
	
	// JDK 8
	default void methodB(){
		System.out.println("methodB() 호출");
	}
	static void methodC() {
		System.out.println("methodC() 호출");
	}
}
