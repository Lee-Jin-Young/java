package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass15 {
	public static void main(String[] args) {
		int num = 2;
		
		MemberDto dto = new MemberDto();
		dto.setNum(num);
		
//		MemberDto dto = new MemberDto(num);
		
		new MemberDao().delete(dto);
		
		boolean isSuccess = new MemberDao().delete(dto);
		if(isSuccess) {
			System.out.println("삭제 완료");
		}
	}
}
