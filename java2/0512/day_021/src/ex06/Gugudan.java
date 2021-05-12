package ex06;

public class Gugudan implements Runnable {
	private int dan;

	public Gugudan(int dan) {
		this.dan = dan;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub 	
		for(int i=1; i<9; i++) {
				System.out.println(dan + "X" + i + "=" + dan*i);
		}
	}
}
