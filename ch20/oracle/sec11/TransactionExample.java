package ch20.oracle.sec11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionExample {
	
	public static void main(String[] args) {

		//connection 인터페이스 선언
		Connection conn = null;
		
		try {
			//JDBC Driver를 메모리로 로딩하고, DriverManager에 등록
			Class.forName("oracle.jdbc.OracleDriver");
			
			//DB와 연결
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "java", "oracle");
			System.out.println("연결 성공");
			
			//트랜잭션 시작--------------------------------------------------------------
			//자동 커밋 기능 끄기
			conn.setAutoCommit(false);
			
			//출금
			String sql1 = "UPDATE accounts SET balance=balance-? WHERE ano=?";
			PreparedStatement pstmt1 = conn.prepareStatement(sql1);
			pstmt1.setInt(1, 10000);
			pstmt1.setString(2, "111-111-1111");
			int rows1 = pstmt1.executeUpdate();
			if(rows1 == 0) throw new Exception("출금되지 않음");
			pstmt1.close();
			
			//입금
			String sql2 = "UPDATE accounts SET balance=balance+? WHERE ano=?";
			PreparedStatement pstmt2 = conn.prepareStatement(sql2);
			pstmt2.setInt(1, 10000);
//			pstmt2.setString(2, "222-222-2222");
			pstmt2.setString(2, "333-333-3333");
			int rows2 = pstmt2.executeUpdate();
			if(rows2 == 0) throw new Exception("입금되지 않음");
			pstmt2.close();
			
			//수동 커밋 -> 모두 성공 처리
			conn.commit();
			System.out.println("계좌 이체 성공");
			//트랜잭션 종료----------------------------------------------------------------
			
		} catch (Exception e) {
			//수동롤백 -> 모두 실패 처리
			try {
				conn.rollback();
			} catch (SQLException e1) {
			}
			System.out.println("계좌 이체 실패");
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					//원래대로 자동 커밋 기능 켜기
					conn.setAutoCommit(true);
					//DB 연결 해제
					conn.close();
				} catch (SQLException e) { }
					System.out.println("연결 해제");
				}
		}
	}
}
