package test.mypac;

public class AnotherThread extends Thread {
	public void run() {
		try {
			Thread.sleep(10000);
		} catch(InterruptedException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("작업이 끝났습니다.");
	}
}
