package exception;

public class IDformatTest {
	
	private String userID;
	private int userpassword;

	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) throws IDFormatException {
		
		if(userID == null) {
			throw new IDFormatException("ID는 NULL 일수 없습니다.");
		}else if(userID.length() < 8 || userID.length() >20) {
			throw new IDFormatException("ID는 8자 20자 이하로 쓰세요");
		}
		this.userID = userID;
	}
	public int getPassword() {
		return userpassword;
	}
	public void setPassword(int password) throws Exception {
		
		if(userpassword == 0) {
			throw new Exception("PassWord는 0일수 없습니다.");
		}else if(userpassword < 8 || userpassword >20) {
			throw new Exception("PASSWORD는 8자 이상 20자 이하로 쓰세요");
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
