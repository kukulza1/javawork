package absracts.player;

public class AdbencedL extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빨리 달립니다");
		
	}

	@Override
	public void jump() {
		System.out.println("높이점프합니다");
		
	}

	@Override
	public void turn() {
		System.out.println("턴할줄 모릅니다.");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("중급자입니다");
		
	}

}
