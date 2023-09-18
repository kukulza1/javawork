package transport;

//사람클래스(자료형)
public class Person {
	//필드
	String name;
	int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
      //버스탑승
	public void takeBus(Bus bus) {
		bus.take(1500);     //버스요금지불
		this.money -= 1500; //요금 만큼 가진금액차감
	}
	//지하철 탑승
	public void takeSubway(Subway subway) {
		subway.take(1350);
		this.money -=1500;
	}
	
	//사람의 정보
	public void showPersonInfo() {
		System.out.println(name+ " 님의돈은"+
	money+"원입니다.");
	}
	
}
