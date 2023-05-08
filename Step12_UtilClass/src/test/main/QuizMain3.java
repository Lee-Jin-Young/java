package test.main;

import java.util.*;

public class QuizMain3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("로또를 몇개 구입하시겠어요? :");
		int amount = scan.nextInt();
		
		for(int i = 0; i<amount; i++) {
			printLotto();
		}

	}

	public static void printLotto() {
		// 로또번호 6개를 출력하는 프로그래밍

		Random ran = new Random();
		Set<Integer> lottoSet = new HashSet<>();

		while (true) {
			int ranNum = ran.nextInt(45) + 1;
			lottoSet.add(ranNum);
			if (lottoSet.size() == 6) {
				break;
			}
		}

		List<Integer> lottoNums = new ArrayList<>(lottoSet);

		Collections.sort(lottoNums);
		// Collections.sort(lottoNums,Collections.reverseOrder()); 내림차순

		for (int i = 0; i < lottoNums.size(); i++) {
			int num = lottoNums.get(i);
			System.out.print(num);
			if (i != lottoNums.size() - 1) {
				System.out.print(", ");
			} else {
				System.out.println();
			}
		}
	}

}
