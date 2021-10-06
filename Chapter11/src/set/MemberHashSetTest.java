package set;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet manger = new MemberHashSet();
		
		Member memberLee = new Member(100, "LEE");
		Member memberKIM = new Member(200, "KIM");
		Member memberCHOI = new Member(300, "CHOI");
		Member memberCHOI2 = new Member(300, "CHOI");
		
		manger.addMember(memberLee);
		manger.addMember(memberKIM);
		manger.addMember(memberCHOI);
		manger.addMember(memberCHOI2);
		
		manger.showAllMember();
		
		manger.removeMember(100);
		manger.showAllMember();
	}

}
