package Chapter4;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int input;
		int i;
		int j;
		int k;
		
			do {
				System.out.println("숫자를 입력하시오 : ");
				input = scanner.nextInt();
				
			for(i=0; i<input; i++) {
				for(j=input; j > i; j--) {
					System.out.print(" ");
				}
				for(k=0; k< i; k++) {
					System.out.print("*");
				}
				for(k=1; k<i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(i=0; i <input; i++) {
				for(j=0; j<i ; j++) {
						System.out.print(" ");	
					}
				for(k=input; k > i; k--) {
					System.out.print("*");
				}
				for(k=input-1;k >i; k--) {
					System.out.print("*");
				}
				System.out.println();
				}		
		}while(input != 0);
	}
}
