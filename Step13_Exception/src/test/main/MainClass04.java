package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("main method start");
		
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main method end");
	}
}
