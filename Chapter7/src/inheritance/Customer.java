package inheritance;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected  String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public int getCustomerID() {
		return customerID;
	}
/*	public Customer() {
		customerGrade = "SIVER";
		bonusRatio = 0.01;
		System.out.println("Customer() ������ ȣ��");
	}*/
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SIVER";
		bonusRatio = 0.01;
		System.out.println("Customer(int, String) ������ ȣ��");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "���� ����� " + customerGrade + "�̸�, ������ ���ʽ� ����Ʈ��" + bonusPoint + "�� �Դϴ�.";
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
