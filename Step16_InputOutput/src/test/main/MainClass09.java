package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass09 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("C:\\Users\\acorn\\acorn202304\\myFolder\\1.jpg");
			fos = new FileOutputStream("C:/Users/acorn/acorn202304/myFolder/copied2.jpg");
			
			byte[] buffer = new byte[1024];
			//반복문 방식
			while(true) {
				int readedCount = fis.read(buffer);
				if(readedCount==-1) break;
				fos.write(buffer,0,readedCount);
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
