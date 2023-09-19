package arrayList.inheritance;

public class Person {
	String name;
	int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	//매개변수의 다형성
	public void take(Vehicle vehicle, int fare) {
		vehicle.carry(fare);
		this.money -= fare;
	}
     
	
	
	//사람의 정보
	public void showPersonInfo() {
		System.out.println(name+ " 님의돈은"+
	money+"원입니다.");
	}

}
