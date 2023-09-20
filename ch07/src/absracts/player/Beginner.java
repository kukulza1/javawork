package absracts.player;

public class Beginner extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히달립니다");
		
	}

	@Override
	public void jump() {
       System.out.println("점프할줄모릅니다");		
	}

	@Override
	public void turn() {
       System.out.println("턴할줄 모릅니다");		
	}

	@Override
	public void showLevelMessage() {
        System.out.println("초보입니다");		
	}

		
	

}
