package test.main;

import test.mypac.*;

public class MainClass01 {
	public static void main(String[] args) {
		FruitBox<Apple> box = new FruitBox<>();
		
		box.pack(new Apple());
		Apple fruit = box.unpack();
		
		FruitBox<Melon> box2 = new FruitBox<>();
		box2.pack(new Melon());
		Melon fruit2 = box2.unpack();
		
		FruitBox<Orange> box3 = new FruitBox<>();
		box3.pack(new Orange());
		Orange fruit3 = box3.unpack();
	}
}
