package singleTon.car;

public class Car {
	//필드
	private static int serialNum = 1000;//기준번호 -클래스 변수
	private int carNum; // 차번호(인스턴스 변수)
	

	public Car() {
		serialNum++;
		carNum=serialNum;
	}
	
	//자동차 번호 출력 매서드
	public int getCarNum() {
		return carNum;
	}

}
