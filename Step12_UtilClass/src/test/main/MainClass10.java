package test.main;

import java.util.*;

public class MainClass10 {
	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		names.add("Aasdf");
		names.add("Badfs");
		names.add("Casdf");
		names.add("Dadfs");
		names.add("Easdf");
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String item = it.next();
			System.out.println(item);
		}
		
		System.out.println("=====");
		
		names.forEach((item) -> {
			System.out.println(item);
		});
		
		boolean isContain = names.contains("Aasdf");
		 int size = names.size();
		 names.remove("Casdf");
		 names.clear();
	}
}
