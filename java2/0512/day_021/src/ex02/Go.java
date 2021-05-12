package ex02;

public class Go extends Thread {
	//작업할 내용을 기술
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =1; i<=10; i++) {
			System.out.println("go :" + i);
		}
	}
}
