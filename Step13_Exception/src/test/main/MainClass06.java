package test.main;

import java.util.Random;
import test.mypac.*;

public class MainClass06 {
	public static void main(String[] args) {
		Random random = new Random();
		
		int ranNum = random.nextInt(5);
		if(ranNum==4) {
			throw new WowException("surprise");
		}
		
		System.out.println("메소드 종료");
	}
}
