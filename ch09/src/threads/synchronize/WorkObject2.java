package threads.synchronize;

public class WorkObject2 {
	public synchronized void methodA() {
		//현재실행중인 스레드 객체 생성
		Thread th = Thread.currentThread();
		System.out.println(th.getName()+": 작업실행");
		notify();//다른스레드를 실행대기 상태로 만듬(알림)
		
		try {
			wait();//자신을 일시정지 상태로 만듬
		} catch (InterruptedException e) {
			e.printStackTrace();
	}

}
}