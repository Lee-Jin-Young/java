package test.main;

import test.mypac.Car;
import java.util.*;
import java.util.function.Consumer;

public class MainClass04 {
	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>();
		
		cars.add(new Car("소나타"));
		cars.add(new Car("벤츠"));
		cars.add(new Car("지프"));
		
		System.out.println("기본 for문");
		for(int i = 0; i<cars.size(); i++) {
			cars.get(i).drive();
		}
		System.out.println("");
		
		System.out.println("확장 for문");
		for(Car c : cars) {
			c.drive();
		}
		System.out.println("");
		
		System.out.println("forEach문 1");
		Consumer<Car> con = new Consumer<>() {
			@Override
			public void accept(Car t) {
				t.drive();
			}
		};
		
		cars.forEach(con);
		System.out.println("");
		
		System.out.println("forEach문 2");
		cars.forEach((t) -> {
			t.drive();
		});
	}
}
