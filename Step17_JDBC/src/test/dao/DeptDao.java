package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.DeptDto;
import test.util.DBConnect;

public class DeptDao {
	// insert
	public boolean insert(DeptDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0; // 수행후 변화된 row의 갯수
		
		try {
			conn = new DBConnect().getConn();

			String sql = "INSERT INTO dept" 
					+ " (deptno, dname, loc)" 
					+ " VALUES(dept_seq.NEXTVAL, ?, ?)";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getDname());
			pstmt.setString(2, dto.getLoc());

			rowCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			} // finally-try
		} // try

		// rowCount가 0이라면 F 아니라면 T
		return rowCount == 0 ? false : true;
	} // insert()

	// update
	public boolean update(DeptDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0; // 수행후 변화된 row의 갯수
		
		try {
			conn = new DBConnect().getConn();

			String sql = "UPDATE dept" 
					+ "	SET dname=?, loc=?" 
					+ " WHERE deptno=?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getDname());
			pstmt.setString(2, dto.getLoc());
			pstmt.setInt(3, dto.getDeptno());

			rowCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			} // finally-try
		} // try

		// rowCount가 0이라면 F 아니라면 T
		return rowCount == 0 ? false : true;
	} // update()

	// delete
	public boolean delete(DeptDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0; // 수행후 변화된 row의 갯수
		
		try {
			conn = new DBConnect().getConn();

			String sql = "DELETE FROM dept" 
					+ " WHERE deptno=?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getDeptno());

			rowCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			} // finally-try
		} // try

		// rowCount가 0이라면 F 아니라면 T
		return rowCount == 0 ? false : true;
	}

	// getList
	public List<DeptDto> getList() {
		List<DeptDto> list = new ArrayList<>();

		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0; // 수행후 변화된 row의 갯수
		
		ResultSet rs = null;
		
		try {
			conn = new DBConnect().getConn();
			String sql = "SELECT deptno, dname, loc"
					+ " FROM dept"
					+ " ORDER BY deptno DESC";
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				DeptDto dto = new DeptDto();
				dto.setDeptno(rs.getInt("deptno"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} //try
		
		return list;
	} //getList()

	// getData
	public DeptDto getData(int deptno) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0; // 수행후 변화된 row의 갯수
		
		ResultSet rs = null;
		
		try {
			conn = new DBConnect().getConn();
			String sql = "SELECT dname, loc"
					+ "	FROM dept"
					+ " WHERE deptno=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			
			rs = pstmt.executeQuery();
			while (rs.next()) {
				DeptDto dto = new DeptDto();
				dto.setDeptno(deptno);
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} //try
		
		return null;
	} //getData()
}
