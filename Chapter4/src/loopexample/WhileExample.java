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
		System.out.println("���� �Է��Ͻÿ� : ");
		input = scanner.nextInt();
		
		while(input != 0) {
			System.out.println("���� �Է��Ͻÿ� : ");
			sum += input;
			input = scanner.nextInt();
		}
		
		System.out.println(sum);
	}
}

// while�� ������ �¾ƾ� ������ �ȴ�
//do while�� ���� ����1�� �ϰ� ������ �ڿ��� üũ �Ѵ�