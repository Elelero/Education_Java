package ch20.oracle.sec08;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardDeleteExample {

	public static void main(String[] args) {
		
		//connection 인터페이스 선언
		Connection conn = null;
		
		try {
			//JDBC Driver를 메모리로 로딩하고, DriverManager에 등록
			Class.forName("oracle.jdbc.OracleDriver");
			
			//DB와 연결
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "java", "oracle");
			System.out.println("연결 성공");
			
			//DB 작업
			//수정코드===================================
			String sql = "delete from boards where bwriter=?";
			//=========================================
			PreparedStatement pstmt = conn.prepareStatement(sql); //수정
			
			//수정코드=====================================================================
			pstmt.setString(1, "winter");
			//===========================================================================
			
			int rows = pstmt.executeUpdate();
			System.out.println("수정된 행의 수: " + rows);
			
			pstmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					//DB 연결 해제
					conn.close();
				} catch (SQLException e) { }
				System.out.println("연결 해제");
				}
		}
		
	}

}
