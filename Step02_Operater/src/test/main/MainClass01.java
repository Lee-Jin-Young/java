package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 2;
		
		int sum = 10+1;
		int sum2 = num1+num2;
		int sum3 = 10+num2;
		
		// 정수끼리 연산하면 결과는 정수만 나온다.
		double result1 = 5/3;
		double result2 = num1/num2;
		
		// 연산의 결과로 실수 값을 원하면 적어도 하나는 실수여야한다.
		double result3 = 5/3.0;
		double result4 = num1/(double)num2;
		double result5 = num1%num2; //나머지 연산
	
	}
}
