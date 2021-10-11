package lambda;

interface PrintString{
	void showString(String str);
}
public class TestLambda {

	public static void main(String[] args) {
		PrintString lambdaStr = s-> System.out.println(s);
		lambdaStr.showString("Test");
		
		showMyString(lambdaStr); // showMyString으로 lambda를 반환
		
		PrintString test = returnString();// test로 반환
		test.showString("Test3"); // 반환 되며 returnString 으로 출력

	}
	public static void showMyString(PrintString p) {
		p.showString("Test2");
	}
	public static PrintString returnString() {
		return s -> System.out.println(s + "!!!");
	}

}
