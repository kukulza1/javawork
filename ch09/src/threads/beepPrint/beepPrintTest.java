package threads.beepPrint;

import java.awt.Toolkit;

public class beepPrintTest {

	public static void main(String[] args) {
		// 싱글 스레드 - 메인 스레드로 실행
		//"띵" 문자를 5번 출력
		//Thread.sleep() 1초 간격으로 대기시간 추가
		//소리 발생 - toolkit beep()
		for(int i=1;i<=5;i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//"띵"소리를 5번 재생하기
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
