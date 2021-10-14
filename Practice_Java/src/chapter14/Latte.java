package chapter14;

public class Latte extends Decorator{

	public Latte(Coffee coffee) {
		super(coffee);
	}
	
	public void brewing() {
		super.brewing(); // 상위 커피를 한번 호출
		System.out.print("Adding Milk ");
	}

}
