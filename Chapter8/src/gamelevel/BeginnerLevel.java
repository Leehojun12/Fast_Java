package gamelevel;

public class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("�޸���");
		
	}

	@Override
	public void jump() {
		System.out.println(" �ɷ¾��� ");
	}

	@Override
	public void turn() {
		System.out.println(" �ɷ¾��� ");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** �ʺ��� ���� *****");
		
	}

}
