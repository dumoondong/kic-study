package ex06;

public class PrintStateThread extends Thread {
	private Thread targetThread;

	public PrintStateThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	//모니터링 하기 위한 스레드
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("스레드 상태:" + state);
			
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			if(state == Thread.State.TERMINATED) {
				break;
			}
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
