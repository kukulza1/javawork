package threads.beepPrint;

public class BeepPrintTest2 {

	public static void main(String[] args) {
		//bt객체 생성 (작업스레드)
		Runnable bt= new beepTask();
		
		//작업스레드 객체생성
		Thread th = new Thread(bt);
		th.start();//스레드 시작
		for(int i=1;i<=5;i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		

	}

}
