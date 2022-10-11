package ch20.oracle.sec09.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserSelectExample {

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
			String sql = "select userid, username, userpassword, userage, useremail from users where userid=?";
			//=================================================================================================
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			//수정코드=====================================================================
			pstmt.setString(1, "winter");
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
/*				String userId = rs.getString("userid");
				String userName = rs.getString("username");
				String userPassword = rs.getString("userpassword");
				int userAge = rs.getInt(4);
				String userEmail = rs.getString("useremail");
				printUser(userId, userName, userPassword, userAge, userEmail);
*/
				//롬복 클래스 이용------------------------------
				User user = new User();
				user.setUserId(rs.getString("userId"));
				user.setUserName(rs.getString("userName"));
				user.setUserPassword(rs.getString("userPassword"));
				user.setUserAge(rs.getInt("userAge"));
				user.setUserEmail(rs.getString("userEmail"));
				printUser(user);
				//-----------------------------------------
				
			} else {
				System.out.println("사용자 아이디가 존재하지 않음");
			}
			rs.close();
			//===========================================================================
			
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
	
	//추가 메소드
	public static void printUser(String userId, String userName, String userPassword, int userAge, String userEmail) {
		System.out.println("userId: " + userId);
		System.out.println("userName: " + userName);
		System.out.println("userPassword: " + userPassword);
		System.out.println("userAge: " + userAge);
		System.out.println("userEmail: " + userEmail);
	}
	
	public static void printUser(User user) {
/*		System.out.println("userId: " + user.getUserId());
		System.out.println("userName: " + user.getUserName());
		System.out.println("userPassword: " + user.getUserPassword());
		System.out.println("userAge: " + user.getUserAge());
		System.out.println("userEmail: " + user.getUserEmail()); */
		System.out.println(user);
	}

}
