package polymorphism;

import inheritance.VIPCustomer;

public class CustomerTest {

	public static void main(String[] args) {

		GoldCustomer goldCustomer = new GoldCustomer(100021, "LEE");
		goldCustomer.customerName = "ภฬศฃมุ";
		goldCustomer.customerGrade = "GOLD";
		goldCustomer.bonusPoint = 1000;
		System.out.println(goldCustomer.showCustomerInfo());
		
	}

}
