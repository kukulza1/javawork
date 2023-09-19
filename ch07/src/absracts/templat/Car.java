package absracts.templat;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	
	public void startCar() {
		System.out.println("시동을 겁니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	//템플릿메서드 정의:상속 받는 클래스에서 수정할수 없다
	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}

}
