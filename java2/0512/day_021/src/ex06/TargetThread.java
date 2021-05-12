package ex06;

public class TargetThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			for(long i=0; i<1_000_000_000; i++) {}
			
			Thread.sleep(1500);
			
			for(long i=0; i<1_000_000_000; i++) {}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
