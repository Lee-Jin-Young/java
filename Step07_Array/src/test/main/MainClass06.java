
package test.main;

import java.util.*;

public class MainClass06 {
	public static void main(String[] args) {
		String[] msgs = new String[5];
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0; i<msgs.length; i++) {
			System.out.print("입력 : ");
			msgs[i] = sc.nextLine();
		}
		
		for(String str : msgs) {
			System.out.println(str);
		}
	}
	
}
 