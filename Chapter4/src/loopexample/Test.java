package loopexample;

public class Test {

	public static void main(String[] args) {
				
		int dan;
		int num;
		
		for(dan = 1; dan < 10; dan++) {
			
			if((dan % 2) != 0) continue;
			System.out.println(" ");
			
			for(num = 1; num < 10; num++) {
				if(num > dan) break;
				System.out.println(dan + "x" +num + "=" + dan*num);
			}
		}
	}

}
