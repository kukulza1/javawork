package threads.threadName;

public class ThreadA extends Thread{
	
	public ThreadA() {
		setName("ThreadA1");
	}
	
	@Override
	public void run() {
		//ThreadA의 이름 -getName()
		for(int i=0;i<2;i++) {
			System.out.println(getName()+"가 출력한 내용");
		}
	}

}
