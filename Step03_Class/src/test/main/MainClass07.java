package test.main;

public class MainClass07 {
	//static 메소드에서 사용하려면 static 필드로 만들어야 한다.
	public static int num = 999;
	
	public static void main(String[] args) {
		
		// 클래스명.필드명 형식으로 static 필드를 참조 한다.
		int result = MainClass07.num+1;
		
		// main() 메소드와 num필드는 둘다 MainClass07안에 속해있으므로 클래스명.은 생략 가능하다.
		int result2 = num+1;
		
		test();
		MainClass07.test();
	}
	
	public static void test() {
		System.out.println("test() 메소드가 호출되었습니다.");
	}
}
