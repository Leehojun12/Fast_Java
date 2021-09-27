package gamelevel;

public class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("빠르게 run");
		
	}

	@Override
	public void jump() {
		System.out.println("jump 가능");
		
	}

	@Override
	public void turn() {
		System.out.println(" 능력 없음");		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 중급자 레벨 ******");
		
	}

}
