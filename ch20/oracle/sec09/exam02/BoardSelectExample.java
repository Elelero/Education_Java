package ch20.oracle.sec09.exam02;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardSelectExample {

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
			//수정코드============================================================================================
			String sql = "select bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata from boards where bwriter=?";
			//=================================================================================================
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			//수정코드=====================================================================
			pstmt.setString(1, "winter");
			
			ResultSet rs = pstmt.executeQuery();
			List<Board> boards = new ArrayList<>();
			while(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				board.setBfileName(rs.getString("bfilename"));
				board.setBfileData(rs.getBlob("bfiledata"));
				
				//파일로 저장
				Blob blob = board.getBfileData();
				if(blob!=null) {
					InputStream is = blob.getBinaryStream();
					OutputStream os = new FileOutputStream("C:/Temp/" + board.getBfileName());
					is.transferTo(os); // 알아두자!
					os.flush();
					
					is.close();
					os.close();
				}
				
				boards.add(board);
			}
			rs.close();
			
			printBoards(boards);
			
			pstmt.close();
			//==========================================================================
			
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
	
	//추가 메소드
	public static void printBoards(List<Board> boards) {
//		for(Board board : boards) {
//			System.out.println(board);
//		}
		boards.stream().forEach(b -> System.out.println(b));
	}
}
