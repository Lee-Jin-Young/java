package test.main;

import test.dto.MemberDto;
import test.dao.MemberDao;

public class MainClass12 {
	public static void main(String[] args) {
		
		String name = "덩어리";
		String addr = "목동";
		
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		
		new MemberDao().insert(dto);
		
	}
}
 