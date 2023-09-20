package interfaceEx.remote2;

import interfaceEx.calculator.remote.RemoteControl;

public class STVtest {

	public static void main(String[] args) {
		//구현 객체(인스턴스)-sr1
		SmartTv sr1 = new SmartTv();
		
		RemoteControl rc=sr1;
		SearchAble searchable = sr1;
		
		rc.turnOn();
		rc.setVolume(8);
		searchable.search("www.naver.com"); 
		rc.setMute(true);
		rc.turnOff();
		
		RemoteControl.chargeBettery();

	}

}
