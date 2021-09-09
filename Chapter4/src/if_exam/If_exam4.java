package if_exam;

import java.util.Scanner;

public class If_exam4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("메달 : ");
		
		int rank = scanner.nextInt();
		char medalColor;
		
		switch(rank){
			case 1: medalColor = 'G';
			System.out.println("금메달이고");
				break;
			case 2: medalColor = 'S';
			System.out.println("은메달이고");
				break;
			case 3: medalColor = 'B';
			System.out.println("동메달이고");
				break;
			default : medalColor = 'A';
		}	
		System.out.println(rank + "등은 " + medalColor + "메달 입니다.");

	}

}
