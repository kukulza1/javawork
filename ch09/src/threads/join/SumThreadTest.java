package threads.join;

public class SumThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumThread sth = new SumThread();
		//메인스레드가 sum스레드를 호출하고 일시정지 상태로 들어감
		sth.start(); //start()-실행대기중
		try {
			sth.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		//메인스레드가 최종 계산된 결과값을 산출하고 종료하면 다시
		//메인스레드는 받아서 출력함
		System.out.println(sth.getSum());

	}

}
