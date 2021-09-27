package chapter7;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerTest  {

	public static void main(String[] args) {
		ArrayList<Customer> list = new ArrayList<Customer>();
		Customer customerLee = new Customer(0001, "��ȣ��");
		Customer customerHue = new GoldCustomer(0002, "�����",12);
		Customer customerKim = new VIPCustomer(0003, "�����", 12345);
		
		list.add(customerLee);
		list.add(customerHue);
		list.add(customerKim);

		
		int customerID;
		int paymoney;
		Customer inputCustomer = null;
		Scanner scanner = new Scanner(System.in);			
		while(true) {
			System.out.print("�ݾ��� �����ÿ� : ");
			paymoney = scanner.nextInt();
			System.out.println("ȸ�� ���̵��� �����ÿ� : ");
			customerID = scanner.nextInt();
			for(Customer cus : list) {
				if (cus.customerID == customerID) {
					inputCustomer = cus;
				}
			}
				
			int cost =0;
				
					cost = inputCustomer.calcPrice(paymoney);
					System.out.println(inputCustomer.showCustomerInfo());
					System.out.println("============== ��� �ǿ����ϴ� ===========");
					System.out.println(inputCustomer.getCustomerName() +" ���� " +  + cost + "�� �����ϼ̽��ϴ�.");
					System.out.println(inputCustomer.getCustomerName() +" ���� ���� ���ʽ� ����Ʈ�� " + inputCustomer.bonusPoint + "���Դϴ�.");
			}
		}
	}


