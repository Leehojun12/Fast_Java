package treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("이호준");
		treeSet.add("박영일");
		treeSet.add("차진호");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
	}

}
