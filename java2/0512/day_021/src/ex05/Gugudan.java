package ex05;

public class Gugudan extends Thread {
	private int dan;

	public Gugudan(int dan) {
		this.dan = dan;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=1; i<9; i++) {
				System.out.println(dan + "X" + i + "=" + dan*i);
		}
	}
}
