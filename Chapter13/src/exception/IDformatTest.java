package exception;

public class IDformatTest {
	
	private String userID;
	private int userpassword;

	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) throws IDFormatException {
		
		if(userID == null) {
			throw new IDFormatException("ID�� NULL �ϼ� �����ϴ�.");
		}else if(userID.length() < 8 || userID.length() >20) {
			throw new IDFormatException("ID�� 8�� 20�� ���Ϸ� ������");
		}
		this.userID = userID;
	}
	public int getPassword() {
		return userpassword;
	}
	public void setPassword(int password) throws Exception {
		
		if(userpassword == 0) {
			throw new Exception("PassWord�� 0�ϼ� �����ϴ�.");
		}else if(userpassword < 8 || userpassword >20) {
			throw new Exception("PASSWORD�� 8�� �̻� 20�� ���Ϸ� ������");
		}	
		this.userpassword = password;
	}
	
	
	public static void main(String[] args) {

		IDformatTest test = new IDformatTest();
		
		String id = null;
		int password;
		try {
			test.setUserID(id);
		} catch (IDFormatException e) {
			System.out.println(e);		
		}
		
		password = 1234123;
		try {
			test.setPassword(password);
		} catch (Exception e) {
			System.out.println(e);		
		}
	}

}
