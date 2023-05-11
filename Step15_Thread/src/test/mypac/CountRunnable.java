package test.mypac;

public class CountRunnable implements Runnable {
	
	@Override
	public void run() {
		int count = 10;
		
		while(count<=0) {
			System.out.println("현재카운트 : "+count);
			
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			count--;
		}
	}
}
