package Chapter4;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
     
	        String input = null;


	        int num1 = 0, num2 = 0;

	        String op = null;


	        System.out.print("���� �ϳ��� �Է��ϼ���.");
	        input = scanner.nextLine();
	        num1 = Integer.parseInt(input);
	       
	        System.out.print("���� �ϳ��� �Է��ϼ���.");
	        input = scanner.nextLine();
	        num2 = Integer.parseInt(input);

	        System.out.print("ó���� ���� ��ȣ�� �Է��ϼ���.");
	        input = scanner.nextLine();
	        op = input;

	        if(op.equals("+"))

	            System.out.printf("%d + %d = %d%n", num1, num2, num1+num2);

	        if(op.equals("-"))

	            System.out.printf("%d - %d = %d%n", num1, num2, num1-num2);

	        if(op.equals("*"))

	            System.out.printf("%d * %d = %d%n", num1, num2, num1*num2);

	        if(op.equals("/"))

	            System.out.printf("%d / %d = %d%n", num1, num2, num1/num2);

	        if(op.equals("%"))

	            System.out.printf("%d / %d�� ������ = %d%n", num1, num2, num1%num2);

	        scanner.close();

	    }

	}