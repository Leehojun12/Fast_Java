package loopexample;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
		
		/*int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;
		}
		
		System.out.println(sum);
		System.out.println(num); */

		
		int input;
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("갑을 입력하시오 : ");
		input = scanner.nextInt();
		
		while(input != 0) {
			System.out.println("갑을 입력하시오 : ");
			sum += input;
			input = scanner.nextInt();
		}
		
		System.out.println(sum);
	}
}

// while은 조건이 맞아야 수행이 된다
//do while은 먼저 수행1번 하고 조건을 뒤에서 체크 한다