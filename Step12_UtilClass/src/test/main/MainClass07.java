package test.main;

import java.util.*;

public class MainClass07 {
	public static void main(String[] args) {
		//세 명의 회원정보를 hashmap에 담아 arraylist객체에 넣기
		HashMap<String,Object> mem1 = new HashMap<>();
		mem1.put("number", 1);
		mem1.put("name", "A");
		mem1.put("addr", "Aa");
		
		HashMap<String,Object> mem2 = new HashMap<>();
		mem2.put("number", 2);
		mem2.put("name", "B");
		mem2.put("addr", "Bb");
		
		HashMap<String,Object> mem3 = new HashMap<>();
		mem3.put("number", 3);
		mem3.put("name", "C");
		mem3.put("addr", "Cc");
		
		//Object type
		List<Object> members1 = new ArrayList<>();
		members1.add(mem1);
		members1.add(mem2);
		members1.add(mem3);
		
		for(Object obj : members1) {
			System.out.println(obj);
			System.out.println();
		}
		
		//Map | HashMap type
		List<Map<String,Object>> members2 = new ArrayList<>();
		members2.add(mem1);
		members2.add(mem2);
		members2.add(mem3);
		
		for(Map<String,Object> temp : members2) {
			System.out.println("number : "+temp.get("number"));
			System.out.println("name : "+temp.get("name"));
			System.out.println("addr : "+temp.get("addr"));
			System.out.println();
		}
		
		
	}
}
