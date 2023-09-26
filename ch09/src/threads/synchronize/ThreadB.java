package threads.synchronize;

public class ThreadB extends Thread {
	private WorkObject workobject;
	
	public ThreadB(WorkObject workobject) {
		this.workobject=workobject;
		setName("ThreadB");
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			workobject.methodB();
		}
	}

}
