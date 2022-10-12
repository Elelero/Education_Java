package ch20.oracle.sec10;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;


public class ProcedureCallExample {

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
			String sql = "{call user_create(?, ?, ?, ?, ?, ?)}";
			CallableStatement cstmt = conn.prepareCall(sql);
			
			//IN 
			cstmt.setString(1, "summer");
			cstmt.setString(2, "한여름");
			cstmt.setString(3, "12345");
			cstmt.setInt(4, 26);
			cstmt.setString(5, "summer@mycompany.com");
			//OUT
			cstmt.registerOutParameter(6, Types.INTEGER); //PLS_INTEGER
			
			//호출
			cstmt.execute();
			//DB 내부에서 실행
			int rows = cstmt.getInt(6);
			System.out.println("저장된 행의 수"+rows);
			
			//닫기
			cstmt.close();
			
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
