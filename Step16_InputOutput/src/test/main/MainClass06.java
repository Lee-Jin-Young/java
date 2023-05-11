package test.main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass06 {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		OutputStream os = ps;
		OutputStreamWriter osw = new OutputStreamWriter(os); //학습을 위해 부모타입 이용
		
		BufferedWriter bw = new BufferedWriter(osw); //조금 더 좋은 기능
		
		try {
			bw.write("하나\r\n");
			bw.write("두울");
			bw.newLine(); //개행기호
			bw.write("세엣");
			bw.flush();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}

