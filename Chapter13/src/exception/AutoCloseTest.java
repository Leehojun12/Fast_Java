package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		try(AutoCloseObj obj = new AutoCloseObj()){
			throw new Exception(); // ������ ���� ȣ��
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
