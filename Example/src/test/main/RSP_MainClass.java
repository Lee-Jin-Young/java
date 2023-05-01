package test.main;

import java.util.*;

public class RSP_MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int user = 0;
		int com = ran.nextInt(1,3);
		
		System.out.println("가위:1, 바위:2, 보:3");
		user = sc.nextInt();
		while (user<1||3<user) {
			System.out.println("1,2,3중 하나를 입력하세요");
			user = sc.nextInt();
		}
		
		if(user == 1) {
			switch(com) {
			case 1 :
				System.out.println("user : 가위, com : 가위");
				System.out.println("무승부");
				break;
			case 2 : 
				System.out.println("user : 가위, com : 바위");
				System.out.println("com승");
				break;
			case 3 : 
				System.out.println("user : 가위, com : 보");
				System.out.println("user승");
				break;
			}
		} else if(user == 2){
			switch(com) {
			case 1 :
				System.out.println("user : 바위, com : 가위");
				System.out.println("user승");
				break;
			case 2 : 
				System.out.println("user : 바위, com : 바위");
				System.out.println("무승부");
				break;
			case 3 : 
				System.out.println("user : 바위, com : 보");
				System.out.println("com승");
				break;
			}
		} else {
			switch(com) {
			case 1 :
				System.out.println("user : 보, com : 가위");
				System.out.println("com승");
				break;
			case 2 : 
				System.out.println("user : 보, com : 바위");
				System.out.println("user승");
				break;
			case 3 : 
				System.out.println("user : 보, com : 보");
				System.out.println("무승부");
				break;
			}
		}
		
	}
}
