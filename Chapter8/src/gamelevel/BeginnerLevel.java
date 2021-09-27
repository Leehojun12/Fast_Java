package gamelevel;

public class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("달린다");
		
	}

	@Override
	public void jump() {
		System.out.println(" 능력없음 ");
	}

	@Override
	public void turn() {
		System.out.println(" 능력없음 ");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 초보자 레벨 *****");
		
	}

}
