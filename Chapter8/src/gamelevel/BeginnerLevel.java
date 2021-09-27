package gamelevel;

public class BeginnerLevel extends PlayerLevel{

	public void run() {
		System.out.println("천천히 달리다");
		
	}

	public void jump() {
		System.out.println("jump 안대");
	}

	public void turn() {
		System.out.println("turn 안대");
		
	}

	public void showLevelMessage() {
		System.out.println("***** 초급자 레벨 *****");
		
	}

}
