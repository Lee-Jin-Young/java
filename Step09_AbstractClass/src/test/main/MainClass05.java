package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	public static void main(String[] args) {
		
		class SewWewpon extends Weapon {

			@Override
			public void attack() {
				System.out.println("바다에 있는 적을 공격");
			}
			
		}
		Weapon w1 = null;
		w1.prepare();
		w1.attack();
	}
}
