package test.main;

import java.util.*;

public class MainClass01 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		
		String item = names.get(0);
		
		names.remove(1);
		
		names.add(0,"에이콘");
		
		int size = names.size();
		
		names.clear();
	}
}
