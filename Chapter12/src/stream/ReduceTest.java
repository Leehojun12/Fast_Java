package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length)
			return s1;
		else return s2;
	}
	
}

public class ReduceTest {

	public static void main(String[] args) {

		String[] greetings = {"¾È³çÇÏ¼¼¿ä~~~~!!", "hello", "Good Morning"};
		
		System.out.println(Arrays.stream(greetings).reduce("",(s1,s2) -> {
			if(s1.getBytes().length >= s2.getBytes().length)
				return s1;
			else return s2;
		}));
		System.out.println(greetings[0].length());
		System.out.println(greetings[1].length());
		System.out.println(greetings[2].length());
		System.out.print(Arrays.stream(greetings).reduce(new CompareString()).get());
	}
}
