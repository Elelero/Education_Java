package ch20.oracle.sec10;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class FunctionCallExample {
	
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
			String sql = "{? = call user_login(?, ?)}";
			CallableStatement cstmt = conn.prepareCall(sql);
			
			//OUT (리턴값)
			cstmt.registerOutParameter(1, Types.INTEGER);
			//IN 
			cstmt.setString(2, "winter");
			cstmt.setString(3, "12345");
			
			//호출
			cstmt.execute();
			//DB 내부에서 실행
			int result = cstmt.getInt(1);

			//닫기
			cstmt.close();
			
			String message = switch(result) {
				case 0 -> "로그인 성공";
				case 1 -> "비밀번호 틀림";
				default -> "로그인 아이디 존재 x";
			};
			System.out.println(message);
			
			
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
