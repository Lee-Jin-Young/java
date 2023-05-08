package test.main;

import java.util.HashMap;
import test.mypac.Car;

public class MainClass06 {
	public static void main(String[] args) {
		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("num", 1);
		map1.put("name", "abc");
		map1.put("isMan", true);
		map1.put("car",new Car("소나타"));
		
		int num = (int) map1.get("num");
		String name = (String)map1.get("name");
		boolean isMan = (boolean)map1.get("isMan");
		Car car = (Car)map1.get("car");
		
		map1.put("name", "에이콘"); //동일한 키값으로 삽입시, 값이 수정된다.
		map1.remove("isMan");
		map1.clear();
	}
}
