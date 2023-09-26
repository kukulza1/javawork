package collection.list.carmap;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
	//객체생성시에 해쉬맵에 저장
	private static CarFactory instance;
	
	private Map<String, Car> cm= new HashMap<>();
	
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		
		return instance;
	}
	public Car createCar(String name) {//차이름(키값)
		if(cm.containsKey(name)) {//cm에 이름이 있으면
			return cm.get(name);//이름을 가져와서 value값(car)반환
		}
		Car car = new Car();
		//cm에 name,car저장
		cm.put(name, car);
		return car;
	}

}
