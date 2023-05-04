package test.main;

import java.util.*;

public class QuizMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> msgs = new ArrayList<>();
		
		for(int i = 0; i<5; i++) {
			msgs.add(sc.nextLine());
		}
		
		for(String s : msgs) {
			System.out.println(s);
		}
	}
}
