package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{ // Externalizable  읽고 쓰는 키워드(override 해서 구현)
	String name;
	transient String job; // transient는 직렬화 하지말아라 하는 키워드
	
	public Person(String name,String job) {
		this.name = name;
		this.job = job;
	}
	public String toString() {
		return name + "," + job;
	}
}

public class SerializationTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Person personLee = new Person("이호준", "개발자");
		Person personKim = new Person("김도영", "축산공학");
		
		try(FileOutputStream fos = new FileOutputStream("serial.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(personLee);
			oos.writeObject(personKim);
		}catch(IOException e) {
			System.out.println(e);
		}
		try(FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			Person p1 =(Person)ois.readObject();
			Person p2 =(Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}
