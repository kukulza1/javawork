package absracts.player;

public abstract class PlayerLevel {
	//추상메서드
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	//템플릿메서드
	public final void go(int count) {
		run();
		for(int i=0;i<count;i++) {//점프는횟수있음
		jump();
		}
		turn();
		
	}

}
