package test.main;

import test.mypac.*;

public class MainClass06 {
	public static void main(String[] args) {
		Weapon w1 = null;
		
		useWeapon(w1);
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
		w.attack();
	}
}
