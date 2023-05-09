package test.main;

import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나눠지는 수 입력");
		String inputNum1 = scan.nextLine();
		System.out.println("나눌 수 입력");
		String inputNum2 = scan.nextLine();
		
		try {
			int num1 = Integer.parseInt(inputNum1);
			int num2 = Integer.parseInt(inputNum2);
			
			int result1 = num1/num2;
			int result2 = num1%num2;
			
			System.out.println("몫"+result1);
			System.out.println("나머지"+result2);
		} catch(Exception e) {
			System.out.println("예외 발생");
			System.out.println("예외 메세지 : "+e.getMessage());
		} finally {
			System.out.println("중요한 작업 실행");
		}
		
		System.out.println("main 메소드가 정상 종료");
	}
}
