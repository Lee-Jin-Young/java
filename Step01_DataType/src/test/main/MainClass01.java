package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		byte iByte = 10;
		short iShort = 10;
		int iInt = 10000;
		long iLong = 10;
		
		int tmp = iShort;
		byte tmp2 = (byte)iShort;
		
		float num1 = 10.1f;
		double num2 = 10.2d;
		double num3 = 10.3; // f,d를 붙히지 않았음으로 double타입으로 간주
		
		float tmp4 = (float)num2;
		System.out.println("main 메소드가 종료 됩니다.");  
	}
}
