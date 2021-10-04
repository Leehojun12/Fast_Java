package chapter9;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException{
	
		System.out.println("B : BubbleSort");
		System.out.println("H : HeaSort");
		System.out.println("Q : QuickSort");
		System.out.println("���� ����� �����Ͻÿ� : ");
		
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
			System.out.println("�߸��� ���");
			return;
		}
		int[] arr = null;
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
	}
}
