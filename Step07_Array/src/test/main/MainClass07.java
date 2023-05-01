package test.main;

import java.util.*;

public class MainClass07 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int ranNum = ran.nextInt(10); //0~9
		int ranNum2 = ran.nextInt(11); //0~10
		int ranNum3 = ran.nextInt(20); //0~19
		int ranNum4 = ran.nextInt(5); //0~4
		int ranNum5 = ran.nextInt(51)-25; //-25~25
		
	}
}
