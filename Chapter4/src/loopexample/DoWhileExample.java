package loopexample;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
	
	/*	int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num++;
		}while(num <= 10);
		
		System.out.println(num);
		System.out.println(sum); */


		
		Scanner scanner = new Scanner(System.in);
		int input;
		int sum = 0;
		
		do {
			System.out.println("값을 입력하시오 : ");
			input = scanner.nextInt();
			sum += input;
			
		}while(input !=0);
		
		System.out.println(sum);
	}
}
