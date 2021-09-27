package gamelevel;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빠른 run 가능");
		
	}

	@Override
	public void jump() {
		System.out.println("높은 jump 가능");
		
	}

	@Override
	public void turn() {
		System.out.println("turn 가능");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 고급자 레벨 *****");
		
	}

}
