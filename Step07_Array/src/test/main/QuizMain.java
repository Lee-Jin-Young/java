package test.main;

import java.util.*;

public class QuizMain {
	public static void main(String[] args) {
		/*
		 * 실행 했을 때 cherry, apple, banana, melon, 7 5개의 문자열중 하나가 랜덤출력
		 */
		
		Random ran = new Random();
		String[] result = {"cherry", "apple", "banana", "melon", "7"};
		
		System.out.println(result[ran.nextInt(5)]);
	}
}
