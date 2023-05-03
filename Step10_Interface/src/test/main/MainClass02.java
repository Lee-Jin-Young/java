package test.main;

import test.mypac.*;

public class MainClass02 {
	public static void main(String[] args) {
		MyRemocon r1 = new MyRemocon();
		Remocon r2 = r1;
		Object r3 = r1;
		
		TvRemocon r4 = new TvRemocon();
		useRemocon(r4);
		r4.reserve();
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
		TvRemocon r2 = (TvRemocon) r;
		r2.reserve();
	}
}
