package operator;

public class OperatorEx4 {
	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i+2) < 10); // �� ���ǽ��� False�̸� �ڿ����� �翬�� False
		//boolean value1 = ((num1 = num1 + 10) < 10) || ((i = i+2) < 10); // �� ���ǽ��� False������ �� �����ڴ� �ڿ����� ��� ���ش�
		System.out.println(num1);
		System.out.println(i);
		System.out.println(value);
		//System.out.println(value1);
		
		int num2 = 10;
		int num3 = 20;
		
		int max = (num2 > num3)? num2:num3; // num2�� �� ũ�� �����Ƿ� num3�� ������
		System.out.println(max);
	}

}
