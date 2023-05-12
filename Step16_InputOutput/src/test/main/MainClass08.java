package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass08 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("C:\\Users\\acorn\\acorn202304\\myFolder\\1.jpg");
			fos = new FileOutputStream("C:/Users/acorn/acorn202304/myFolder/copied.jpg");
			
			//반복문 방식
			while(true) {
				int readedByte = fis.read();
				if(readedByte==-1) break;
				fos.write(readedByte);
				fos.flush();
			}
			System.out.println("파일이 복사되었습니다.");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos!=null) fos.close();
				if(fis!=null) fis.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		} //finally
	}
}
