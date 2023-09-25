package threads.synchronize;

public class SynchornizeTest {

	public static void main(String[] args) {
		// 공유객체 생성
		Calculator calc = new Calculator();
		
		//user1스레드 객체생성
		User1Thread User1t = new User1Thread();
		User1t.setCalculator(calc);
		User1t.start();
		
		User2Thread User2t = new User2Thread();
		User2t.setCalculator(calc);
		User2t.start();

	}

}
