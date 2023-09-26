package threads.synchronize;

public class WaitNotifyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkObject workbject = new WorkObject();
		
		ThreadA threadA = new ThreadA(workbject);
		ThreadB threadb = new ThreadB(workbject);
		
		threadA.start();
		threadb.start();
		

	}

}
