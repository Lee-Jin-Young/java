package test.main;

import test.mypac.Car;

public class MainClass07 {
	public static void main(String[] args) {
		useCar(new Car());
		 /*
		  * Car클래스는 final 클래스이므로 상속받아서 Override 할 수 없다.
		useCar(new Car() {
			@Override
			public void drive() {
				System.out.println("매우 빠르게 달린다.");
			}
		});
		*/
	}
	
	public static void useCar(Car c) {
		c.drive();
		c.drive();
	}
}
