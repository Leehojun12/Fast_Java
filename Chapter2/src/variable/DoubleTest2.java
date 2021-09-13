package variable;

public class DoubleTest2 {
	
	public static void main(String[] args) {
		
		double dNum = 1;
		int i = 0;
		
		for(i=0; i< 1000; i++) {
			
			dNum  = dNum + 0.1;
		}
		System.out.println(dNum);
	}

}
