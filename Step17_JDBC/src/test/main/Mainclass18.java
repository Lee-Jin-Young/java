package test.main;

import java.util.List;
import java.util.Scanner;

import test.dao.DeptDao;
import test.dto.DeptDto;

public class Mainclass18 {
	public static void main(String[] args) {
		DeptDto dto = new DeptDto();
		DeptDao dao = new DeptDao();
		dto.setDeptno(1);
		dto.setDname("에이콘");
		dto.setLoc("강남");
		
		//insert()
		System.out.println("회원 정보 추가");
		
		boolean isInsertSuccess = dao.insert(dto);
		
		if (isInsertSuccess) {
			System.out.printf("회원의 이름은 : %s 주소는 : %s\n", dto.getDname(), dto.getLoc());
		}

		System.out.println("=====");
		
		//update()
		System.out.println("회원 정보 변경");
		
		boolean isUpdateSuccess = dao.update(dto);
		
		if (isUpdateSuccess) {
			System.out.println("수정 완료");
		}

		System.out.println("=====");
		
		//delete()
		System.out.println("회원 정보 삭제");
		
		boolean isDeleteSuccess = dao.delete(dto);
		
		if (isDeleteSuccess) {
			System.out.println("삭제 완료");
		}

		System.out.println("=====");
		
		//getList()
		System.out.println("모든 회원 정보");
		
		List<DeptDto> list = dao.getList();
		
		for (DeptDto temp : list) {
			System.out.printf("%d번 회원의 이름은 : %s 주소는 : %s\n", dto.getDeptno(), dto.getDname(), dto.getLoc());
		}

		System.out.println("=====");
		
		//getData()
		System.out.println("회원 정보 검색");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 회원 번호 입력");
		int deptno = scan.nextInt();
		dto = new DeptDao().getData(deptno);
		
		if (dto != null) {
			System.out.printf("%d번 회원의 이름은 : %s 주소는 : %s\n", deptno, dto.getDname(), dto.getLoc());
		} else {
			System.out.printf("%d번 회원은 존재하지 않습니다.\n", deptno);
		}
	}
}
