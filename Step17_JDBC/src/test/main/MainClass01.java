package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClass01 {
	public static void main(String[] args) {
	      Connection conn=null;
	      
	      try {
	         //오라클 드라이버 로딩
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         //@아이피주소:포트번호:DB이름
	         String url="jdbc:oracle:thin:@localhost:1521:xe";
	         conn=DriverManager.getConnection(url, "scott", "tiger");
	         System.out.println("Oracle DB 접속 성공");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      try {
	    	  String sql = "SELECT num, name, addr"
	    			  + " FROM member" //공백이 없으면 addrFrom 으로 인식
	    			  + " ORDER BY num DESC";//공백이 없으면 memberORDER 으로 인식
	    	  pstmt = conn.prepareStatement(sql);
	    	  //SELECT문 실행하고 결과 값을 ResultSet으로 얻는다.
	    	  rs = pstmt.executeQuery();
	    	  while(rs.next()) {
	    		  int num = rs.getInt("num");
	    		  String name = rs.getString("name");
	    		  String addr = rs.getString("addr");
	    		  
	    		  System.out.printf("num : %d | name : %s | addr : %s\n", num, name, addr);
	    	  }
	      } catch (Exception e) {
	    	  e.printStackTrace();
	      }
	}
}
