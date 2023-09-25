package threads.synchronize;

public class User1Thread extends Thread{
	//calculator 객체를 참조
	private Calculator calc;
	
	public User1Thread() {
		setName("User1th");//스레드 이름 설정
	}
	public void setCalculator(Calculator calc) {
		this.calc=calc;
	}
	@Override
	public void run() {
		calc.setMemory(100);
	}
	

}
