package ex04;

public class ThreadEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gugudan g1 = new Gugudan(2);
		Gugudan g2 = new Gugudan(4);
		
		g1.setName("2단 스레드");
		g2.setName("4단 스레드");
		g1.start();
		g2.start();
	}

}
