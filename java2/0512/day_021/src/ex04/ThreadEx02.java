package ex04;

public class ThreadEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		
		t2.setPriority(7);
		
		System.out.println("t1 priority : "+ t1.getPriority());
		System.out.println("t2 priority : "+ t2.getPriority());
		
		t1.start();
		t2.start();
	}

}
