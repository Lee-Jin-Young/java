package test.mypac;

public class TvRemocon implements Remocon {

	@Override
	public void up() {
		System.out.println("위 채널로 이동");
	}

	@Override
	public void down() {
		System.out.println("아래 채널로 이동");
	}
	
	public void reserve() {
		System.out.println("종료 예약");
	}
}
