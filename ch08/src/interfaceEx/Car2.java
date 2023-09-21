package interfaceEx;

public class Car2 {
	//필드 배열로 선언
	Tire[] tires = {
			new HanTire(),
			new HanTire(),
			new KumTire(),
			new KumTire(),
	};
	
	void run() {
		for(Tire tire: tires) {
			tire.roll();
		}
	}

}
