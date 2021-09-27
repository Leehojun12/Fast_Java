package chapter7;

public class GoldCustomer extends Customer {
	
	double salesRating;

	
	public GoldCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		
		customerGrade = "Gold";
		bonusRating = 0.05;
		salesRating = 0.1;	
	}
	
	@Override
	public int calcPrice(int price){
		bonusPoint += price * bonusRating;
		return price - (int)(price * salesRating);
	}
	

}
