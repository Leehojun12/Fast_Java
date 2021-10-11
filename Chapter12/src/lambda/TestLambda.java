package lambda;

interface PrintString{
	void showString(String str);
}
public class TestLambda {

	public static void main(String[] args) {
		PrintString lambdaStr = s-> System.out.println(s);
		lambdaStr.showString("Test");
		
		showMyString(lambdaStr); // showMyString���� lambda�� ��ȯ
		
		PrintString test = returnString();// test�� ��ȯ
		test.showString("Test3"); // ��ȯ �Ǹ� returnString ���� ���

	}
	public static void showMyString(PrintString p) {
		p.showString("Test2");
	}
	public static PrintString returnString() {
		return s -> System.out.println(s + "!!!");
	}

}
