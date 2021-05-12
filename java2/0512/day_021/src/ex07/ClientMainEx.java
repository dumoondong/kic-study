package ex07;

public class ClientMainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
		Thread client1 = new Thread(new Client(account));
		Thread client2 = new Thread(new Client(account));
		
		client1.start();
		client2.start();
	}

}
