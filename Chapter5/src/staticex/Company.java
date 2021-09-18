package staticex;

public class Company {

	private static Company instance = new Company(); // System에서 유일
	private Company() { // 외부에서 사용X
		
	}
	public static Company getInstane() {
		if( instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
