package stream.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {

	public static void main(String[] args) {
		
		System.out.println("입력 후 끝 작성 : ");
		try {
			int i;
			InputStreamReader isr = new InputStreamReader(System.in); // 보조 스트림
			while ((i = isr.read()) != '끝') { // 읽을때 반복문으로 계속 읽게 해준다.
			System.out.print((char)i);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
