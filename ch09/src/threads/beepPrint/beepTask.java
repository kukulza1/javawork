package threads.beepPrint;

import java.awt.Toolkit;

public class beepTask implements Runnable {

	//runnable 인터페이스는 run()메서드가 있고
	//구현할때 재정의 해야함
	//비프음이 발생하는 작업스레드를 구현
	@Override
	public void run() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		for(int i=1;i<=5;i++) {
			tk.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}

}
}