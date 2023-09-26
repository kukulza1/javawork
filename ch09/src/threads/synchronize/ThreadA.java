package threads.synchronize;

public class ThreadA extends Thread {
	private WorkObject workobject;
	
	public ThreadA(WorkObject workobject) {
		this.workobject=workobject;
		setName("ThreadA");
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			workobject.methodA();
		}
	}

}
