package interfaceEx.remote2;

import interfaceEx.calculator.remote.RemoteControl;
//다중 인터페이스 구현
public class SmartTv implements RemoteControl,SearchAble {
	private int volume;
	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다");
		
	}

	@Override
	public void turnOn() {
		System.out.println("TV를켭니다");		
	}

	@Override
	public void turnOff() {
		System.out.println("Tv를끕니다");		
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
 		if(RemoteControl.MAX_VOLUME<volume) {
 			this.volume = RemoteControl.MAX_VOLUME;
 		}else if(RemoteControl.MIN_VOLUME>volume) {
 			this.volume = RemoteControl.MIN_VOLUME;
 		}else {
 			this.volume = volume;
 		}
 		System.out.println("현재볼륨은"+this.volume+"입니다");
}		
	}


