package test.main;

import java.util.*;

public class MainClass01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("숫자입력 : ");
		String inputNum = scan.nextLine();
		try {
			double num = Double.parseDouble(inputNum);
			double result = num + 100;
			System.out.println("입력한 숫자 + 100 : " + result);
		} catch (NumberFormatException nfe) {
			/*
			 * 실행 스택에서 일어난 일을 콘솔창에 출력
			 */
			nfe.printStackTrace();
		}

		System.out.println("마무리 작업을 하고 main 메소드가 종료됩니다.");
	}
}
