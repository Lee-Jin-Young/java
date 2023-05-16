package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		int num = 1;
		String name = "김구라";
		String addr = "독산동";
		
		/*
		MemberDto dto = new MemberDto();
		dto.setNum(num);
		dto.setName(name);
		dto.setAddr(addr);
		*/
		
		MemberDto dto = new MemberDto(num, name, addr);
		
		new MemberDao().update(dto);
		
		boolean isSuccess = new MemberDao().update(dto);
		if(isSuccess) {
			System.out.println("수정 완료");
		}
	}
}
