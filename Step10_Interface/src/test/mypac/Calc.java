package test.mypac;

@FunctionalInterface //추상메소드를 한개만 만들도록 강제하는 역할
public interface Calc {
	//메소드로 두개의 실수를 전달 받아서 어떤 연산을 하고 결과 값을 리턴해주는 메소드
	public double execute(double num1, double num2);
}
