package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

		Person person = new Person("hojun");
		System.out.println(person);
		
		Class c = Class.forName("classex.Person");
		Person person1 = (Person)c.newInstance();
		System.out.println(person1);
		
		Class[] parameterTypes = {String.class};
		Constructor cons = c.getConstructor(parameterTypes);
		
		Object[] initargs = {"¿Ã»£¡ÿ"};
		Person personLee = (Person)cons.newInstance(initargs);
		System.out.println(personLee);

	}

}
