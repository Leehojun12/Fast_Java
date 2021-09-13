package classpart;

public class FunctionTest {
	
	public static int addNum(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	public static void sayHello(String greeting) {
		System.out.println(greeting); // 출력하고 반환은 x
	}
	
	public static int calcSum() {
		
		int sum = 0;
		int i;
		
		for(i=0;i<101;i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[]args) {
		
		int n1 = 10;
		int n2 = 20;
		
		int total =addNum(n1, n2);
		
		sayHello("안녕하세요"); // 반환이 안되므로
		int talk = calcSum(); // calcSum으로 받아서 출력
		
		System.out.println(total);
		System.out.println(talk);
	}

}
