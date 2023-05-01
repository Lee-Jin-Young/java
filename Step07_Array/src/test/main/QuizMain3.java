package test.main;

import java.util.Random;

public class QuizMain3 {
	public static void main(String[] args) {
		/*
		 * 실행했을 때 5개의 문자열 중에서 3개가 한 줄에 한번에 랜덤하게 출력
		 */
		
		Random ran = new Random();
		String[] result = {"cherry", "apple", "banana", "melon", "7"};
		/* 한줄
		System.out.printf("%s | %s | %s \n",
				result[ran.nextInt(5)],
				result[ran.nextInt(5)],
				result[ran.nextInt(5)]);
		*/
		
		String a = result[ran.nextInt(5)];
		String b = result[ran.nextInt(5)];
		String c = result[ran.nextInt(5)];
		
		System.out.printf("%s | %s | %s \n",a,b,c);
		if (a==b&& b==c) {
			System.out.println("lucky");
		}
		
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
			} //if
			
		} //for
		System.out.println("당첨 횟수 : "+cnt);
		*/
	}
}
