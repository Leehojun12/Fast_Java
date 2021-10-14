package others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);
		System.out.println(rf.getFilePointer()); // 위치를 알수 있다 4byte니까 4;
		rf.writeDouble(3.14);
		rf.writeUTF("안녕하세요");
		
		rf.seek(0); // 처음 위치로 돌아간다
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		rf.close();
	}

}
