package test.main;

import test.mypac.*;

public class MainClass06 {
	public static void main(String[] args) {
		//new Weapon()은 이름이 없는 익명의 클래스 extends Weapon()되었다.
		Weapon w1 = new Weapon() {
			@Override
			public void attack() {
				System.out.println("아무나 공격");
			}
		};
		
		useWeapon(w1);
		
		//아래 메소드를 호출하려면 Weapon타입의 변수가 필요
		useWeapon(new Weapon() {
			@Override
			public void attack() {
			}
		});
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
		w.attack();
	}
}
