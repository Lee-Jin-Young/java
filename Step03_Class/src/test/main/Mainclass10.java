package test.main;

import test.mypac.*;

public class Mainclass10 {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		rect1.height = 10;
		rect1.width = 20;
		rect1.PrintArea();
		
		Rectangle rect2 = new Rectangle();
		rect2.height = 10;
		rect2.width = 10;
		rect2.PrintArea();
	}
}
