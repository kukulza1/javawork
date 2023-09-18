package polymorphism.fluit;

public class Fluit {
	//필드
	protected String name;
	protected String weight;
	protected int price;
	
	public Fluit() {}
	
	public void showFluitInfo() {
		System.out.println("과일이름:" + name);
		System.out.println("과일무게:" + weight);
		System.out.println("과일가격:" + price);
	}

}
