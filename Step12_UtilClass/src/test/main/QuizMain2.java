package test.main;

import java.util.*;

public class QuizMain2 {
	public static void main(String[] args) {
		Map<String, String> dic = new HashMap<>();
		dic.put("house", "집");
		dic.put("phone", "전화기");
		dic.put("car", "자동차");
		dic.put("pencil", "연필");
		dic.put("eraser", "지우개");
		
		/*
		 * 검색할 단어를 입력하세요 : house
		 * house의 뜻은 집입니다.
		 * 
		 * 검색할 단어를 입력하세요 : hello
		 * hello는 목록에 없습니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("검색할 단어를 입력하세요 : ");
		String word = sc.nextLine();
		if(dic.containsKey(word)) {
			System.out.printf("%s의 뜻은 %s입니다.",word,dic.get(word));
		} else {
			System.out.printf("%s는 목록에 없습니다.",word);
		}
		
	}

}
