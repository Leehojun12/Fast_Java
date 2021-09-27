package polymorphism;

public class GoldCustomer extends Customer{

	double salesRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		salesRatio = 0.1;
		System.out.println("GoldCustomer(int)생성자 호출");
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price *bonusRatio;
		return price - (int)(price*salesRatio);
	}

}
