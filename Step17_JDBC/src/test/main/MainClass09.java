package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import test.dto.MemberDto;

public class MainClass09 {
	public static void main(String[] args) {
		String name = "에이콘";
		String addr = "강남역";

		MemberDto md = new MemberDto();
		md.setName(name);
		md.setAddr(addr);

		insert(md);
	}

	public static void insert(MemberDto dto) {
		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Oracle DB 접속 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}

		PreparedStatement pstmt = null;
		try {
			String sql = "INSERT INTO member"
					+ " (num, name, addr)"
					+ " VALUES(?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getNum());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getAddr());

			pstmt.executeUpdate();
			System.out.println("회원 정보를 추가하였습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
