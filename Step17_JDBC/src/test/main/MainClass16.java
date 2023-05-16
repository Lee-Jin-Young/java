package test.main;

import java.util.List;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass16 {
	public static void main(String[] args) {
		List<MemberDto> list = new MemberDao().getList();
		for(MemberDto temp : list) {
			System.out.println("num : "+temp.getNum()
					+ " | name : " + temp.getName()
					+ " | addr : " + temp.getAddr());
		}
	}
}
