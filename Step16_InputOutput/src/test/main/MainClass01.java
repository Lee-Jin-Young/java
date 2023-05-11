package test.main;

import java.io.IOException;
import java.io.InputStream;

public class MainClass01 {
	public static void main(String[] args) {
		InputStream kbd = System.in;
		try {
			System.out.print("입력 : ");
			int code = kbd.read();
			System.out.println(code);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
