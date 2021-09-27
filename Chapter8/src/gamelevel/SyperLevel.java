package gamelevel;


public class SyperLevel extends PlayerLevel{
	
	public void run() {
		System.out.println("엄청 빨리 달리다");
		
	}

	public void jump() {
		System.out.println("엄청 높이 jump ");
	}

	public void turn() {
		System.out.println("turn 가능");
		
	}

	public void showLevelMessage() {
		System.out.println("***** 고급자 레벨  *****");
		
	}

}
