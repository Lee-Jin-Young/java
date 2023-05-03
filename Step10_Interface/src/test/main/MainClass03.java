package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		Remocon r1 = new Remocon() {

			@Override
			public void up() {
				System.out.println("볼륨 올린다");
			}

			@Override
			public void down() {
				System.out.println("볼륨 내린다");
			}};
	}
	//아래 메소드를 호출하기 위해서는 Remocon인터페이스 타입의 참조값이 필요하다.
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
