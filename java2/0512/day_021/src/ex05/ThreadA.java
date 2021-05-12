package ex05;

public class ThreadA extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!stop) {
			if(work) {
				System.out.println("ThreaA 작업 중");
			}else {
				Thread.yield();
			}
		}
		System.out.println("ThreadA 작업 종료");
	}
}
