package chapter7;

import java.util.Scanner;

public class Customer {

	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRating;
	
	Scanner scanner = new Scanner(System.in);

	public Customer(int customerID, String customerName){
		this.customerID = customerID;		
		this.customerName = customerName;

		customerGrade = "SIVER";
		bonusRating = 0.01;	
	}
	public Customer() {
		customerID = 0001;
		customerName = "이호준";
	}
	public int calcPrice(int paymoney){
		bonusPoint += paymoney * bonusRating;
		return paymoney;
	}
	public String showCustomerInfo() {
		return customerName +" : " + customerGrade +" 보너스 포인트 : " + bonusPoint +" 할인률 :" +bonusRating;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
		
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
}

