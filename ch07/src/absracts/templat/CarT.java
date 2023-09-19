package absracts.templat;

public class CarT {

	public static void main(String[] args) {

       //Car C1 = new Car(); 추상클래스는 객체생성 불가
		//추상클래스 타입(Car)으로 객체생성
		Car C1= new  ManualCar();
		C1.run();
		
		System.out.println("==============");
		Car C2 = new AiCar();
		C2.run();

	}
	

}
