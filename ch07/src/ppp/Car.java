package ppp;

public abstract class Car {
	//추상메서드 사용이유
	//상속받는 자식클래스에 반드시 구현하도록 제시,강제함
	public abstract void refuel(); //추상메서드
		
	
	public abstract void run();
		
	
	public void stop() {
		System.out.println("차량이 정차합니다.");
	

}
}
