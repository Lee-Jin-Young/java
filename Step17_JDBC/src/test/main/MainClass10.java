package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass10 {
	public static void main(String[] args) {
		int num = 1;
		String name = "호빵";
		String addr = "독산동";

		MemberDto m = new MemberDto();
		m.setNum(num);
		m.setName(name);
		m.setAddr(addr);

		MainClass10.update(m);
	}

	public static void update(MemberDto dto) {
		Connection conn = null;

		PreparedStatement pstmt = null;
		try {
			conn = new DBConnect().getConn();
			String sql = "UPDATE member"
					+ " SET name=?, addr=?"
					+ " WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());

			pstmt.executeUpdate();
			System.out.println("회원 정보를 수정하였습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
