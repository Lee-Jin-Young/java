package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		String[] names = new String[3];
		
		names[0] = "가";
		names[1] = "나";
		names[2] = "다";
		
		System.out.println("단순 출력");
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		System.out.println("반복문 이용");
		for(int i = 0; i<names.length; i++) {
			System.out.println(names[i]);
		}
;	}
}
