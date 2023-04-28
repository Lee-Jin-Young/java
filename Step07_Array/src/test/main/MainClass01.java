package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		int[] nums = {10, 20, 30, 40, 50};
		double[] nums2 = {10.1, 10.2, 10.3, 10.4, 10.5};
		boolean[] truth = {true, false, false, true, true};
		String[] names = {"가나다", "라마바", "사아자", "차카타", "파하"};
		
		//배열 객체에는 clone()이라는 메소드와 length라는 필드가 있다.
		
		int[] result = nums.clone();
		int size = nums.length;
		int first = nums[0];
		int seconde = nums[1];
		int third = nums[2];
	}
}
