package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass05 {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		OutputStream os = ps;
		OutputStreamWriter osw = new OutputStreamWriter(os); // 학습을 위해 부모타입 이용
		
		try {
			osw.write(48148);
			osw.write(48372);
			osw.write(44031);
			osw.write("아니다");
			osw.flush();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
