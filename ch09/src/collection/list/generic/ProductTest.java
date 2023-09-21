package collection.list.generic;

public class ProductTest {

	public static void main(String[] args) {
		// product 객체 생성<클래스,문자열>
		Product<TV,String> prod1 = new Product<>();
		
		//Tv 인스턴스 생성
		TV tv = new TV();
		
		prod1.setKind(tv);
		prod1.setModel("스마트TV");
		
		tv.making();
		System.out.println("모델명:"+prod1.getModel());
         
		Product<Car,String> c1 = new Product<>();
		
		Car c = new Car();
		
		c1.setKind(c);
		c1.setModel("전기차");
		
		c.makecar();
		System.out.println("모델명:"+c1.getModel());
	}

}
