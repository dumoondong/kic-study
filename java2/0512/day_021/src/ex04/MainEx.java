package ex04;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//익명내부클래스
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i =1; i<=10; i++) {
					System.out.println("go :" + i);
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i =1; i<=10; i++) {
					System.out.println("come :" + i);
				}
			}
		});
		t1.start();
		t2.start();
	}

}
