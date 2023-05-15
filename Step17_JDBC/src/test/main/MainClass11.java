package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnect;

public class MainClass11 {
	public static void main(String[] args) {
		int num = 3;
		
		MainClass11.delete(num);
	}
	
	public static void delete(int num) {
		Connection conn = null;
		
		PreparedStatement pstmt = null;
		try {
			conn = new DBConnect().getConn();
			String sql = "DELETE FROM member"
					+ " WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);

			pstmt.executeUpdate();
			System.out.println("회원 정보를 삭제하였습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
