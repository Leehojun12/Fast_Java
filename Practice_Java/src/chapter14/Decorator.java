package chapter14;

public class Decorator extends Coffee{
	
	Coffee coffee;
	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	}
	@Override
	public void brewing() {
		coffee.brewing(); // Input read�� �ѹ� ȣ��
		
	}
	

}
