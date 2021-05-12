package ex05;

public class ThreadB extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!stop) {
			if(work) {
				System.out.println("ThreaB 작업 중");
			}else {
				Thread.yield();
			}
		}
		System.out.println("ThreadB 작업 종료");
	}
}
