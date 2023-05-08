package test.main;

import java.util.*;

public class MainClass11 {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		//중복 제거
		Set<Integer> set = new HashSet<>(nums);
		
		//중복 제거된 리스트
		List<Integer> result = new ArrayList<>(set);
	}
}
