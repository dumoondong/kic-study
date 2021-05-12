package ex05;

public class YieldEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(3000);
			
			threadA.work = false;
			
			Thread.sleep(3000);
			
			threadB.work = false;
			
			Thread.sleep(3000);
			
			
			threadA.stop = true;
			threadB.stop = true;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


