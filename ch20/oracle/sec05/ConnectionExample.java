package ch20.oracle.sec05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample {

	public static void main(String[] args) {
		
/*		Connection conn = null;
		
		try() {
			//JDBC Driver를 메모리로 로딩하고, DriverManager에 등록
			Class.forName("oracle.jdbc.OracleDriver");
			
			//DB와 연결
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.32:1521/orcl", "java", "oracle");
			System.out.println("연결 성공");
			
			//DB 작업
			//작업내용---------
			
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
*/
		//다른 방법 - 자동 리소스 닫기--------------------------------------------------------------
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			try(Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.32:1521/orcl", "java", "oracle")){
				System.out.println("연결 성공");
				//DB 작업
				//작업내용---------
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("연결 해제");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
