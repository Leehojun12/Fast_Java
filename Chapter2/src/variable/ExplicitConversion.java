package variable;

public class ExplicitConversion {
	public static void main(String[] args) {
		
		int i = 1000;
		byte bNum = (byte)i; // 명시적으로 byte를 넣으므로써 강제 형변환- 데이터 유실 
		System.out.println(bNum);
		
		double dNum1 = 1.2;
		float fNum = 0.9f;
		
		int iNum1 = (int)dNum1 + (int)fNum; // 1+0이 됨 형변환하게되면 소수점 날아감
		int iNum2 = (int)(dNum1 + fNum); // 더하고 나서 소수점이 날아감 == 2
		
		System.out.println(iNum1);
		System.out.println(iNum2);
	}

}
