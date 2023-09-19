package arrayList.inheritance;

public class Main {

	public static void main(String[] args) {
		// person 객체 생성
		Person p1 = new Person("SB",10000);
		Person p2 = new Person("KSB",20000);
		
		Bus bus100 = new Bus("bus100");
		
		p1.take(bus100, 1500);
		p2.take(bus100, 1600);
		
		p1.showPersonInfo();
		p2.showPersonInfo();
		bus100.showInfo();

	}

}
