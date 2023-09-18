package singleTon.car;

public class CarFactory {
	private static CarFactory instance; 
		
	private CarFactory() {}
	//instance 생성 매서드 정의
	public static CarFactory getInstance() {
		if(instance==null) {
			instance= new CarFactory();
		}
		return instance;
	}
	//자동차 생성 매서드
	public Car createCar() {
		Car c1 = new Car();
		return c1;
	}

}
