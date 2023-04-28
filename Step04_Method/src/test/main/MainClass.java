package test.main;

import test.mypac.*;

public class MainClass {
	public static void main(String[] args) {
		Test t = new Test();
		t.walk();
		
		int a = t.getNumber();
		System.out.println(a);
		System.out.println(t.getNumber());
		
		String b = t.getGreeting();
		System.out.println(b);
		System.out.println(t.getGreeting());
		
		Airplane c = t.getPlane();
		c.fly();
		
		t.setNum(999);
		t.setName("abc");
		t.setPlane(c);
		
		t.send();
		t.send(a);
		t.send(b);
		t.send(c);
		
		System.out.println("main메소드가 종료됩니다.");
	}
}
