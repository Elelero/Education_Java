package ch20.oracle.sec06;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardWithFileInsertExample {

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
					//수정코드=========================================================================================================================================
					String sql = "insert into boards (bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata) values(seq_bno.nextval, ?, ?, ?, sysdate, ?, ?)";
					//==============================================================================================================================================
					PreparedStatement pstmt = conn.prepareStatement(sql, new String[] {"bno", "btitle"});
					
					//수정코드=====================================================================
					pstmt.setString(1, "스키");
					pstmt.setString(2, "드디어 스키 시즌이 왔어요.");
					pstmt.setString(3, "winter");
					pstmt.setString(4, "photo1.jpg");
					pstmt.setBlob(5, new FileInputStream("src/ch20/oracle/sec06/photo1.jpg"));
					//===========================================================================
					
					int rows = pstmt.executeUpdate();
					System.out.println("저장된 행의 수: " + rows);
					
					//추가코드(bno 값 조사 및 확인)==================================================================
					if(rows == 1) {
						ResultSet rs = pstmt.getGeneratedKeys(); //생성된 키를 가져온다 = new String[] {"bno"} 키의 값
						if(rs.next()) {
							int bno = rs.getInt(1); //인덱스값 넣기
							System.out.println("저장된 bno: " + bno); 
							
							String btitle = rs.getString(2);
							System.out.println("저장된 btitle: " + btitle);
						}
						rs.close();
					}
					//========================================================================================
					
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
