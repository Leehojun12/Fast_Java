package staticex;

public class Company {

	private static Company instance = new Company(); // System���� ����
	private Company() { // �ܺο��� ���X
		
	}
	public static Company getInstane() {
		if( instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
