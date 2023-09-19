package absracts.templat;

public class AiCar extends Car {

	@Override
	public void drive() {
		System.out.println("자율주행중");
		
	}

	@Override
	public void stop() {
		System.out.println("자율정차합니다.");
		
	}

}
