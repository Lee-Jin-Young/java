package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MemberDao {
	Connection conn = null;
	PreparedStatement pstmt = null; 
	int rowCount = 0; //수행후 변화된 row의 갯수
	
	
	//회원 한 명의 정보를 저장 하고 해당 작업의 성공 여부를 리턴하는 메소드
	public boolean insert(MemberDto dto) {
		try {
			conn = new DBConnect().getConn();
			
			String sql = "INSERT INTO member"
					+ " (num, name, addr)" 
					+ " VALUES( member_seq.NEXTVAL, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
		
			rowCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			} //finally-try
		}
		
		//rowCount가 0이라면 F 아니라면 T
		return rowCount == 0 ? false : true;
	}
	
	//회원 한 명의 정보를 수정 하고 해당 작업의 성공 여부를 리턴하는 메소드
		public boolean update(MemberDto dto) {
			try {
				conn = new DBConnect().getConn();
				
				String sql = "UPDATE member"
						+ " SET name=?, addr=?" 
						+ " WHERE num=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, dto.getName());
				pstmt.setString(2, dto.getAddr());
				pstmt.setInt(3, dto.getNum());
			
				rowCount = pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();
				} catch(Exception e) {
					e.printStackTrace();
				} //finally-try
			}
			
			//rowCount가 0이라면 F 아니라면 T
			return rowCount == 0 ? false : true;
		}
		
		//회원 한 명의 정보를 삭제 하고 해당 작업의 성공 여부를 리턴하는 메소드
		public boolean delete(MemberDto dto) {
			try {
				conn = new DBConnect().getConn();
				
				conn = new DBConnect().getConn();
				String sql = "DELETE FROM member"
						+ " WHERE num=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, dto.getNum());
			
				rowCount = pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();
				} catch(Exception e) {
					e.printStackTrace();
				} //finally-try
			}
			
			//rowCount가 0이라면 F 아니라면 T
			return rowCount == 0 ? false : true;
		}
}
