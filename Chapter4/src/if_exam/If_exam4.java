package if_exam;

import java.util.Scanner;

public class If_exam4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�޴� : ");
		
		int rank = scanner.nextInt();
		char medalColor;
		
		switch(rank){
			case 1: medalColor = 'G';
			System.out.println("�ݸ޴��̰�");
				break;
			case 2: medalColor = 'S';
			System.out.println("���޴��̰�");
				break;
			case 3: medalColor = 'B';
			System.out.println("���޴��̰�");
				break;
			default : medalColor = 'A';
		}	
		System.out.println(rank + "���� " + medalColor + "�޴� �Դϴ�.");

	}

}
