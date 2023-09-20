package interfaceEx.calculator.remote;

public class RemoteCtest {

	public static void main(String[] args) {
		//인터페이스형(부모형)으로 객체생성//자동형변환
		RemoteControl tv1 = new Tv();
		
		tv1.turnOn();
		
		tv1.setVolume(12);
		tv1.setMute(true);
		tv1.setMute(false);
		tv1.turnOff();
		
		//건전지교환
		RemoteControl.chargeBettery();
		
		

	}

}
