package if_exam;

import java.util.Scanner;

public class If_Exam2 {

	public static void main(String[] args) {
		System.out.println("���̸� �Է��Ͻÿ� : ");
		
		Scanner scanner = new Scanner(System.in); // �Է��� �Ҽ� �ְ� ��
		int age = scanner.nextInt();
		
		int charge = 0;
		
		if(age < 8) {
			charge = 1000;
		}else if(age < 14){
			charge = 1500;
		}else if(age < 20) {
			charge = 2000;
		}else {
			charge = 3000;
		}
		System.out.println("���� : "+ age);
		System.out.println("��� : "+ charge);
	}

}
