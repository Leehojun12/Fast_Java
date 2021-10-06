package treeset;
import java.util.TreeSet;
import java.util.Iterator;

public class MemberTreeSet {
	
	private TreeSet<Member> TreeSet;
	public MemberTreeSet() {
		TreeSet = new TreeSet<Member>(new Member());
	}
	public void addMember(Member member) {
		TreeSet.add(member);
	}
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = TreeSet.iterator(); // ��ȸ
		while(ir.hasNext()) {
			Member member = ir.next();
			if(member.getMemberId() == memberId) {
				TreeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "��ȣ�� ���� ���� �ʴ´�.");
		return false;
	}
	public void showAllMember() {
		for(Member member :TreeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}
