package string;

public class StringTest2 {

	public static void main(String[] args) {
		
		String java = new String("java");
		String android = new String("android");
		System.out.println(System.identityHashCode(java));
		
		java = java.concat(android); // java¶û android¸¦ ¿¬°á
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
	}

}
