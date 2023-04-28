package test.main;

import test.mypac.Car;

public class MainClass01 {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.drive();
		car1.name="소나타";
		car1.price = 1000;
		
		Car car2 = new Car();
		car2.drive();
		car2.name ="그랜저";
		car2.price=2000;
		
		boolean result = car1 == car2;
		boolean result2 = car1.name == car2.name;
	}
}
