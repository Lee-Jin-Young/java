package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MemberDao {	
	//회원 한 명의 정보를 저장 하고 해당 작업의 성공 여부를 리턴하는 메소드
	public boolean insert(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null; 
		int rowCount = 0; //수행후 변화된 row의 갯수
		
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
	} //insert
	
	//회원 한 명의 정보를 수정 하고 해당 작업의 성공 여부를 리턴하는 메소드
		public boolean update(MemberDto dto) {
			Connection conn = null;
			PreparedStatement pstmt = null; 
			int rowCount = 0; //수행후 변화된 row의 갯수
			
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
		} //update
		
		//회원 한 명의 정보를 삭제 하고 해당 작업의 성공 여부를 리턴하는 메소드
		public boolean delete(int num) {
			Connection conn = null;
			PreparedStatement pstmt = null; 
			int rowCount = 0; //수행후 변화된 row의 갯수
			
			try {
				conn = new DBConnect().getConn();
				
				String sql = "DELETE FROM member"
						+ " WHERE num=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, num);
			
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
		} //delete
		
		//특정 회원의 정보를 불러오는 메소드
		public MemberDto getData(int num) {
			MemberDto dto = null;
			
			Connection conn = null;
			PreparedStatement pstmt = null; 
			ResultSet rs = null;
			
			try {
				conn = new DBConnect().getConn();
				String sql = "SELECT name, addr"
			               + " FROM member"
			               + " WHERE num=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, num);
				
				rs = pstmt.executeQuery();
				while(rs.next()) {				
					String name = rs.getString("name");
					String addr = rs.getString("addr");
					
					dto = new MemberDto();
					dto.setNum(num);
					dto.setName(name);
					dto.setAddr(addr);
					
					return dto;
				}
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if(rs!=null) rs.close();
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			} //try
			
			return null;
		}
		
		//회원의 전체 정보를 리턴하는 메소드
		public List<MemberDto> getList() {
			List<MemberDto> list = new ArrayList<>();
			
			Connection conn = null;
			PreparedStatement pstmt = null; 
			ResultSet rs = null;
			
			try {
				conn = new DBConnect().getConn();
				String sql = "SELECT num, name, addr"
						+ " FROM member"
						+ " ORDER BY num DESC";
				pstmt = conn.prepareStatement(sql);
				
				rs = pstmt.executeQuery();
				while(rs.next()) {				
					MemberDto dto = new MemberDto();
					dto.setNum(rs.getInt("num"));
					dto.setName(rs.getString("name"));
					dto.setAddr(rs.getString("addr"));
					
					list.add(dto);
				}
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if(rs!=null) rs.close();
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			} //try
			
			return list;
		} //getList
		
}
