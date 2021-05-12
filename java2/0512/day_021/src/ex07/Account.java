package ex07;

public class Account {
	//통장계좌
	private int balance = 1000;
	
	public int getBalance() {
		return balance;
	}
	public synchronized void withdraw(int money ) {
		if(balance >= money) {
			
			try {
				Thread.sleep(1000);
				
				//
				balance -= money;
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
