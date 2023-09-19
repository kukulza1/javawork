package interfaceEx.calculator.remocoon;

public interface RemoteControl {
	public int MAX_VOLUME =10;
	public int MIN_VOLUME =0;
	
	
	//추상매서드
    public void turnOn();
    
    public void turnOff();
    
    public void setVolume(int volume);
    
    //정적메서드
    static void chargeBettery() {
    	System.out.println("건전지를 교환합니다");
    }
    //일반(구체화) 메서드 -default키워드 붙힘
    default void setMute(boolean mute) {
    	if(mute) {//mute == true
    		System.out.println("무음처리합니다.");
    	}else {
    		System.out.println("무음 해제합니다");
    	}
    
    }

}
