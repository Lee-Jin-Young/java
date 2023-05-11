package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr); //문자열 한줄씩 입력
		*/
		
		//한줄로 표현
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("입력 : ");
			String line = br.readLine();
			System.out.println("line : "+line);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
