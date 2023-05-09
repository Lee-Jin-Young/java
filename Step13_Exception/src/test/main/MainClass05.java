package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass05 {
	public static void main(String[] args) {
		File f = new File("C:/Users/acorn/acorn202304/myFolder/memo.txt");

		try {
			if (!f.exists()) {
				f.createNewFile();
			} else {
				f.delete();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}
}
