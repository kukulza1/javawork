package threads.synchronize;

public class WorkObject {
	public synchronized void methodA() {
	//동기화 메서드로 구현(내부적으로 잠금)
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
		public synchronized void methodB() {
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
