package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c2 = Class.forName("java.lang.String");

		Constructor[] cons = c2.getConstructors();
		for(Constructor con: cons) {
			System.out.println(con);
		}
		
		System.out.println();
		
		Method[] methods = c2.getMethods();
		for(Method method: methods) {
			System.out.println(method);
		}
	}

}
