package chapter12;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
	 
		TravelCustomer customerLee = new TravelCustomer("이호준", 30, 100);
		TravelCustomer customerKim = new TravelCustomer("김원규", 20, 90);
		TravelCustomer customercha = new TravelCustomer("차진호", 45, 110);
		
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customercha);
		
		System.out.println(customerList);
		
		customerList.stream().map(c ->c.getName()).forEach(s -> System.out.print(s + " "));
		int total = customerList.stream().mapToInt(c ->c.getPrice()).sum();
		System.out.println(total);
		
		customerList.stream().filter(c->c.getAge() >= 25).map(c ->c.getName()).sorted().forEach(s -> System.out.print(s + " "));
	}

}
