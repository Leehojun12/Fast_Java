package gamelevel;

public class MainBoardPlay {

	public static void main(String[] args) {
		
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SyperLevel sLevel = new SyperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}

}
