package ex04;

public class MyThread1 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<300; i++) {
			System.out.println("-");
		}
	}
}
