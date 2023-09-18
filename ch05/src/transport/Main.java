package transport;

public class Main {

	public static void main(String[] args) {
		//사람 객체 생성
		Person p1 = new Person("SB",10000);
		Person p2 = new Person("우영우",20000);
		
		//버스 객체생성
		Bus bus100 = new Bus(100);
		Bus bus740 = new Bus(740);
		
		//지하철 객체 생성
		Subway green = new Subway("2호선");
		 
		p1.takeBus(bus100);
		p2.takeBus(bus100);
		p1.takeBus(bus740);
		
		p1.takeSubway(green);
		
		//정보출력
		p1.showPersonInfo();
		p2.showPersonInfo();
		System.out.println("=================");
		bus100.showBusInfo();
		bus740.showBusInfo();
		green.showSubwayInfo();
		}
				
	}

