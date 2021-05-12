package ex06;

public class ThreadStateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStateThread printStateThread = new PrintStateThread(new TargetThread());
		printStateThread.start();
	}

}
