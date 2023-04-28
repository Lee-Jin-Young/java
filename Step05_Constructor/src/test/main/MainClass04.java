package test.main;

import java.util.Random;

public class MainClass04 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int ranNum = 0;
		int[] ranArr = new int[10];
		
		for (int i = 0; i<100; i++) {
			ranNum = ran.nextInt(10);
			System.out.println(i+" : "+ranNum);
			ranArr[ranNum]++;
		}
		
		for (int i = 0; i<10; i++) {
			System.out.println(i+"는 "+ranArr[i]+"번 나왔습니다.");
		}
		
		
	}
}
