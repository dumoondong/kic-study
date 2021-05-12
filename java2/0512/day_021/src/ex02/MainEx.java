package ex02;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("시작");
		
		Go g = new Go();
		Come c = new Come();
		
		//g.run();
		//c.run();
		//스레드를 실행하는 메서드
		g.start();
		c.start();
		
		System.out.println("끝");
	}

}
