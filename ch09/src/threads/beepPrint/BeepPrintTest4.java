package threads.beepPrint;

import java.awt.Toolkit;

public class BeepPrintTest4 {

	public static void main(String[] args) {
		// 스레드를 람다식(함수형 프로그래밍)으로 구현
		Thread th = new Thread(()->{//람다식:매개변수가 없을때 소괄호 생략불가
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=1; i<=5;i++) {
				toolkit.beep();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		
		});
		th.start();
		for(int i=0;i<=5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
