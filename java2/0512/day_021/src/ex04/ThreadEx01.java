package ex04;

public class ThreadEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 <= priority <= 10
		System.out.println( Thread.currentThread().getPriority());
		
		//숫자
		//상수 Thread.MAX_PRIORITY
		//상수 Thread.NORM_PRIORITY
		//상수 Thread.MIN_PRIORITY
		
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);

		System.out.println( Thread.currentThread().getPriority());
	}

}
