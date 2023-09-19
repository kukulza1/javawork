package ppp;

public class CarT {

	public static void main(String[] args) {
		Bus bus = new Bus();
		AutoCar ac1 = new AutoCar();
		
		bus.run();
		ac1.run();
		bus.refuel();
		ac1.refuel();
		bus.takePassenger();
		ac1.load();
		bus.stop();
		ac1.stop();

	}

}
