package absracts.player;

public class Player {
	//필드
	private PlayerLevel level;
	
	//생성자
	public Player() {
		level = new Beginner();//기본으로 초보자넣음
		level.showLevelMessage();
	}
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	//플레이어가 게임하는 메서드
    public void Play(int count) {
    	level.go(count);
    }
}
