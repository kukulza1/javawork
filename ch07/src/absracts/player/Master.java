package absracts.player;

public class Master extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("매우빨리달립니다");
		
	}

	@Override
	public void jump() {
		System.out.println("반복점프가능합니다");
		
	}

	@Override
	public void turn() {
		System.out.println("턴 가능합니다");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("달인입니다");
		
	}

}
