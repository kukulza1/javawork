package collection.list.carmap;

public class CarTest {

	public static void main(String[] args) {
		//싱글톤이므로 factory의 주소는 동일하다
		CarFactory cf = CarFactory.getInstance();
		
		Car sonata1 = cf.createCar("연수차");
		Car sonata2 = cf.createCar("연수차");
		System.out.println(sonata1 == sonata2);
		
		Car avante1 = cf.createCar("승연차");
		Car avante2 = cf.createCar("승연차");
		System.out.println(avante1 == avante2);
		
		System.out.println(sonata1 == avante1);

	}

}
