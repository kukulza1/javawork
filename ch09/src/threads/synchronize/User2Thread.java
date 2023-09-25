package threads.synchronize;

public class User2Thread extends Thread{
	//calculator 객체를 참조
	private Calculator calc1;
	
	public User2Thread() {
		setName("User2th");//스레드 이름 설정
	}
	public void setCalculator(Calculator calc1) {
		this.calc1=calc1;
	}
	@Override
	public void run() {
		calc1.setMemory(550);
	}
	

}
