package absracts.player;

public class PlayerTest {

	public static void main(String[] args) {
		Player p1 = new Player();
		
		p1.Play(1);
		
		AdbencedL p2 = new AdbencedL();
		p1.upgradeLevel(p2);
		p1.Play(2);
		
		Master p3 = new Master();
		
		p1.upgradeLevel(p3);
		p1.Play(3);
		
		

	}

}
