package test.main;

import java.util.*;
import java.util.function.Consumer;

public class MainClass03 {
	public static void main(String[] args) {
		List<String> greets = new ArrayList<>();
		greets.add("hello");
		greets.add("hi");
		greets.add("good night");
		
		Consumer<String> con = new Consumer<>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		};
		
		greets.forEach(con);
		
		System.out.println("*********");
		
		greets.forEach((t) -> {
				System.out.println(t);
		});
	}
}
