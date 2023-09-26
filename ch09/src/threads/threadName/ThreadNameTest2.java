package threads.threadName;



public class ThreadNameTest2 {

	public static void main(String[] args) {
		//스레드 생성 -익명객체
		Thread Mt = Thread.currentThread();
		System.out.println(Mt.getName());
		
		for(int i=0; i<2;i++) {
			//Thread(작업 스레드) 객체생성
			Thread threadA = new Thread() {
				@Override
				public void run() {
                     System.out.println(getName()+"실행");					
				}
			};
			threadA.start();
			
		}
		//작업스레드 1개 생성
		for(int i=0;i<2; i++) {
			Thread threadB = new Thread() {
			public void run() {
				System.out.println(getName()+"실행");
				
				}
			};
			threadB.setName("cccc");
			threadB.start();
			
		}

	}

}
