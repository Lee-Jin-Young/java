package test.mypac;

import test.mypac.Zoo.Monkey;

public class Zoo {
	public class Monkey {
		public void say() {
			System.out.println("I'm Monkey");
		}
	}
	
	public class Tiger {
		public void say() {
			System.out.println("I'm Tiger");
		}
	}

	
	public Monkey getMonkey() {
		return new Monkey();
	}

}
