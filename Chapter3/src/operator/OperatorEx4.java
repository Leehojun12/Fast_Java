package operator;

public class OperatorEx4 {
	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i+2) < 10); // 앞 조건식이 False이면 뒤에꺼는 당연히 False
		//boolean value1 = ((num1 = num1 + 10) < 10) || ((i = i+2) < 10); // 앞 조건식이 False이지만 곱 연산자는 뒤에꺼를 계산 해준다
		System.out.println(num1);
		System.out.println(i);
		System.out.println(value);
		//System.out.println(value1);
		
		int num2 = 10;
		int num3 = 20;
		
		int max = (num2 > num3)? num2:num3; // num2가 더 크지 않으므로 num3를 가져옴
		System.out.println(max);
	}

}
