package chapter14;

public class Latte extends Decorator{

	public Latte(Coffee coffee) {
		super(coffee);
	}
	
	public void brewing() {
		super.brewing(); // ���� Ŀ�Ǹ� �ѹ� ȣ��
		System.out.print("Adding Milk ");
	}

}
