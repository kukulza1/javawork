package  singleTon.car;

public class CarT {

	public static void main(String[] args) {
		// 싱글톤 객체는 1개임
		CarFactory factory = CarFactory.getInstance();
		
		Car mycar = factory.createCar();
		Car mycar1 = factory.createCar();
		Car mycar2 = factory.createCar();
		System.out.println("신차번호:" + mycar.getCarNum());
		System.out.println("중고차번호:"+mycar1.getCarNum());
		System.out.println("내차번호:"+mycar2.getCarNum());

	}

}
