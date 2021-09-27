package abstractex;

public abstract class Computer {

	
	public abstract void display(); // 구현을 하지 않는다
	public abstract void typing();
	public void On() {
		System.out.println("전원을 켭니다.");
	}
	public void Off() {
		System.out.println("전원을 끕니다.");
	}
}
