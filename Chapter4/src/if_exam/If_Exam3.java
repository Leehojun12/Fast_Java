package if_exam;

import java.util.Scanner;

public class If_Exam3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("성적을 입력하시오 : ");
		
		int grade = scanner.nextInt();
				
		
		if(grade < 59) {
			System.out.println("F");
		}else if(grade < 70) {
			System.out.println("D");
		}else if(grade < 80) {
			System.out.println("C");
		}else if(grade < 90) {
			System.out.println("B");
		}else {
			System.out.println("A");
		}
	}

}
