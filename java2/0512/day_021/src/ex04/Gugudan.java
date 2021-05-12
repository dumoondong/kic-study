package ex04;

public class Gugudan extends Thread {
	private int dan;

	public Gugudan(int dan) {
		this.dan = dan;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(this.getName());
		
		for(int i=1; i<9; i++) {
				System.out.println(dan + "X" + i + "=" + dan*i);
		}
	}
}
