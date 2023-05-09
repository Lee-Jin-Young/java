package test.main;

import test.mypac.*;

public class MainClass07 {
	
	private static void sends() {
		try {
			MyUtil.send();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		MyUtil.draw();
		
		//MyUtil.send(); try-catch필요
		sends();

		System.out.println("메소드 종료");
	}

	
}
