package threads.threadName;

public class ThreadNameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread mainT = Thread.currentThread();
		System.out.println("프로그램 시작 스레드이름"+mainT.getName());
		
		//이름을 정해주지 않으면 0부터 시작됨-Thread-0
		ThreadA thA = new ThreadA();
		System.out.println("작업스레드 이름"+thA.getName());
		thA.run();

		ThreadB thb = new ThreadB();
		System.out.println("b작업스레드이름"+thb.getName());
		thb.run();
		
		
	}

}
