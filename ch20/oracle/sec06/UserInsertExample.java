package ch20.oracle.sec06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertExample {

	public static void main(String[] args) {
		
		//connection 인터페이스 선언
		Connection conn = null;
		
		try {
			//JDBC Driver를 메모리로 로딩하고, DriverManager에 등록
			Class.forName("oracle.jdbc.OracleDriver");
			
			//DB와 연결
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "java", "oracle");
			System.out.println("연결 성공");
			
			//DB 작업(추가코드)=============================================================================================
			//매개변수화된 insert(sql)문
			String sql = "insert into users (userid, username, userpassword, userage, useremail) values(?, ?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			//기존 데이터에 없는 데이터를 추가 (같은 데이터를 추가하면 중복저장되어 에러발생)
			pstmt.setString(1, "fall");
			pstmt.setString(2, "김단풍");
			pstmt.setString(3, "12345");
			pstmt.setInt(4, 27);
			pstmt.setString(5, "fall@mycompany.com");
			
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행의 수: " + rows);
			
			pstmt.close();
			
			//===========================================================================================================
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
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
