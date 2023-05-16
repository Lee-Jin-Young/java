package test.main;

import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 회원 번호 입력");
		int num = scan.nextInt();
		MemberDto dto = new MemberDao().getData(num);
		if(dto!=null) {
			System.out.printf("%d번 회원의 이름은 : %s 주소는 : %s", num, dto.getName(), dto.getAddr());
		} else {
			System.out.printf("%d번 회원은 존재하지 않습니다.", num);
		}
	}
}
