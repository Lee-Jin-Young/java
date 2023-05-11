package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass07 {
	public static void main(String[] args) {
		File f = new File("C:/Users/acorn/acorn202304/myFolder/diary.txt");
		
		String msg = "안녕하세요";
		
		try {
			if (!f.exists()) {
				f.createNewFile();
				System.out.println("diary.txt 파일을 만들었습니다.");
			}
			
			//파일에 문자열을 출력 할 수 있는 객체
			//FileWriter fw = new FileWriter(f); 
			FileWriter fw = new FileWriter(f, true); //(file객체, append모드)
			
			fw.write(msg);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
