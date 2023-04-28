package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		boolean isWait = true;
		//삼항 연산자 사용
		String result = isWait ? "wait" : "go";
		
		System.out.println(result);
		
		//if-else문 사용
		String result2 = null;
		
		if(isWait) {
			result2 = "wait";
		} else {
			result2 = "go";
		}
		
		System.out.println(result2);
	}
}
