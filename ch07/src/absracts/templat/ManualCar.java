package absracts.templat;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("운전중");
		
	}

	@Override
	public void stop() {
		System.out.println("정차합니다.");
		
	}
	/*public void run() {
		drive();
		stop();
	} XX */

}
