package stream.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {

	public static void main(String[] args) {
		
		System.out.println("�Է� �� �� �ۼ� : ");
		try {
			int i;
			InputStreamReader isr = new InputStreamReader(System.in); // ���� ��Ʈ��
			while ((i = isr.read()) != '��') { // ������ �ݺ������� ��� �а� ���ش�.
			System.out.print((char)i);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
