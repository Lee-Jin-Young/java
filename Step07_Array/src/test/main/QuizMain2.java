package test.main;

import java.util.Random;

public class QuizMain2 {
	public static void main(String[] args) {
		/*
		 * 3개가 같을 때는 당첨 하나라도 다르면 꽝
		 */
		
		Random ran = new Random();
		String[] result = {"cherry", "apple", "banana", "melon", "7"};
		
		String a = result[ran.nextInt(5)];
		String b = result[ran.nextInt(5)];
		String c = result[ran.nextInt(5)];
		
		System.out.printf("%s | %s | %s \n",a,b,c);
		String res = (a==b&& b==c) ? "당첨" : "꽝";
		System.out.println(res);
		
		/* 100번 반복하여 3개가 같을 경우 lucky
		int cnt = 0;
		for(int i = 0; i<100; i++) {
			String a = result[ran.nextInt(5)];
			String b = result[ran.nextInt(5)];
			String c = result[ran.nextInt(5)];
			
			System.out.printf("%s | %s | %s\n",a,b,c);
			if (a==b&& b==c) {
				System.out.println();
				System.out.println("☆★lucky★☆");
				System.out.println();
				cnt++;
			} else {
				System.out.println("꽝");
			} //if
			
		} //for
		System.out.println("당첨 횟수 : "+cnt);
		*/
	}
}
