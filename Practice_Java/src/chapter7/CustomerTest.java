package chapter7;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerTest  {

	public static void main(String[] args) {
		ArrayList<Customer> list = new ArrayList<Customer>();
		Customer customerLee = new Customer(0001, "이호준");
		Customer customerHue = new GoldCustomer(0002, "허건희",12);
		Customer customerKim = new VIPCustomer(0003, "김원규", 12345);
		
		list.add(customerLee);
		list.add(customerHue);
		list.add(customerKim);

		
		int customerID;
		int paymoney;
		Customer inputCustomer = null;
		Scanner scanner = new Scanner(System.in);			
		while(true) {
			System.out.print("금액을 적으시오 : ");
			paymoney = scanner.nextInt();
			System.out.println("회원 아이디을 적으시오 : ");
			customerID = scanner.nextInt();
			for(Customer cus : list) {
				if (cus.customerID == customerID) {
					inputCustomer = cus;
				}
			}
				
			int cost =0;
				
					cost = inputCustomer.calcPrice(paymoney);
					System.out.println(inputCustomer.showCustomerInfo());
					System.out.println("============== 계산 되였습니다 ===========");
					System.out.println(inputCustomer.getCustomerName() +" 님이 " +  + cost + "원 지불하셨습니다.");
					System.out.println(inputCustomer.getCustomerName() +" 님의 현재 보너스 포인트는 " + inputCustomer.bonusPoint + "점입니다.");
			}
		}
	}


