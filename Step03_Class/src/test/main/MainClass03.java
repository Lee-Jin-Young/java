package test.main;

import test.mypac.*;

public class MainClass03 {
	public static void main(String[] args) {
		// Car 객체를 생성해서 사용하지 않고 버림
		new Car();
		
		// Car객체를 생성해서 한번 사용하고 버림
		new Car().drive();
		
		//필요 할 때마다 사용
		Car c1 = new Car();
		c1.drive();
		c1.drive();
		
		// drive() 메소드는 return타입이 void이기 땨문에 아래의 코드는 성립하지 않는다.
		//Car c2 = new Car().divive();
	}
}
