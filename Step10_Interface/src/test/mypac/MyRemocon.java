package test.mypac;

public class MyRemocon implements Remocon {

	@Override
	public void up() {
		System.out.println("채널을 올린다.");
	}

	@Override
	public void down() {
		System.out.println("채널을 내린다.");
	}
	
}