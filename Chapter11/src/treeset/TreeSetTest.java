package treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("��ȣ��");
		treeSet.add("�ڿ���");
		treeSet.add("����ȣ");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
	}

}
