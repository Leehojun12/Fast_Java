package chapter9;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException{
	
		System.out.println("B : BubbleSort");
		System.out.println("H : HeaSort");
		System.out.println("Q : QuickSort");
		System.out.println("정렬 방식을 선택하시오 : ");
		
		int ch =System.in.read();
		Sort sort = null;
		
		if(ch == 'B' || ch == 'b') {
			sort = new BubbleSort();
		}
		else if(ch == 'H' || ch == 'h') {
			sort = new HeaSort();
		}
		else if(ch == 'Q' || ch == 'q') {
			sort = new QuickSort();
		}
		else {
			System.out.println("잘못된 경로");
			return;
		}
		int[] arr = null;
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
	}
}
