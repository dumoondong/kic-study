package ex06;

public class DeamonEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("시작");
		
		Thread t1 = new Thread(new Gugudan(2));
		Thread t2 = new Thread(new Gugudan(5));
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("끝");
		
	}

}
