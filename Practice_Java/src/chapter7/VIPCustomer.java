package chapter7;

public class VIPCustomer extends Customer {

	double salesRating;
	private int agentID;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRating = 0.1;
		salesRating = 0.2;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRating;
		return price -(int)(price * salesRating);
	}
	
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 상담원 번호는" + getAgentID() + "번 입니다.";
	}
	public int getAgentID(){

		agentID = 10;
		return agentID;
	}
}
