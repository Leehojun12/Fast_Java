package classpart;

public class MallTest {
	public static void main(String[]args) {
		
		Mall mall = new Mall();
		
		mall.ordernumber = 201907210001L;
		mall.ID = "abc123";
		mall.Date = "2019�� 7�� 21��";
		mall.name = "��ȣ��";
		mall.packnumber = "PD0345-12";
		mall.address = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : " + mall.ordernumber);
		System.out.println("�ֹ��� ���̵� : " + mall.ID);
		System.out.println("�ֹ� ��¥ : " + mall.Date);
		System.out.println("�ֹ��� �̸� : " + mall.name);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + mall.packnumber);
		System.out.println("��� �ּ� : " + mall.address);
		
	}

}