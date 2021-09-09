package loopexample;

import java.util.Scanner;

public class NestedLoop {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int dan = 0;
		int num = 0;
		
		/* for(dan = 0; dan < 10; dan++) {
			System.out.println(" 숫자를 입력 하시오: ");
			dan = scanner.nextInt();
			
			for(num= 1; num <= 9; num++) {
				System.out.println(dan + "x" + num + "=" + dan * num);
			}
			System.out.println();
		} */
		
		while(dan < 10) {
			num = 1;
			System.out.println(" 숫자를 입력 하시오: ");
			dan = scanner.nextInt();
			
			while(num < 10) {
				System.out.println(dan + "x" + num + "=" + dan * num);
				num++;
			}
			System.out.println();
			dan++;
		}
	}
}
