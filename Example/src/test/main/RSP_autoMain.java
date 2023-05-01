package test.main;

import java.util.*;

public class RSP_autoMain {
	public static void main(String[] args) {
		Random ran = new Random();
		int userCnt = 0;
		int comCnt = 0;
		int sameCnt = 0;

		for (int i = 0; i < 100; i++) {

			int user = ran.nextInt(1, 3);
			int com = ran.nextInt(1, 3);

			if (user == 1) {
				switch (com) {
				case 1:
					System.out.println("user : 가위, com : 가위");
					System.out.println("무승부");
					sameCnt++;
					break;
				case 2:
					System.out.println("user : 가위, com : 바위");
					System.out.println("COM승");
					comCnt++;
					break;
				case 3:
					System.out.println("user : 가위, com : 보");
					System.out.println("USER승");
					userCnt++;
					break;
				}
			} else if (user == 2) {
				switch (com) {
				case 1:
					System.out.println("user : 바위, com : 가위");
					System.out.println("USER승");
					userCnt++;
					break;
				case 2:
					System.out.println("user : 바위, com : 바위");
					System.out.println("무승부");
					sameCnt++;
					break;
				case 3:
					System.out.println("user : 바위, com : 보");
					System.out.println("COM승");
					comCnt++;
					break;
				}
			} else {
				switch (com) {
				case 1:
					System.out.println("user : 보, com : 가위");
					System.out.println("COM승");
					comCnt++;
					break;
				case 2:
					System.out.println("user : 보, com : 바위");
					System.out.println("USER승");
					userCnt++;
					break;
				case 3:
					System.out.println("user : 보, com : 보");
					System.out.println("무승부");
					sameCnt++;
					break;
				}
			}			
		}
		System.out.printf("%d승 %d무 %d패\n",userCnt,sameCnt,comCnt);
	}
}
