package ch20.oracle.sec12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardExample {
	//Field
	private Scanner sc = new Scanner(System.in);
	private Connection conn;
	private String loginId;
	
	//Constructor
	public BoardExample() {
		try {
			//JDBC Driver 등록
			Class.forName("oracle.jdbc.OracleDriver");
			
			//연결하기
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "java", "oracle");
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}
	}
	
	
	//Method - list()
	public void list() {
		System.out.println();
		System.out.println("[게시물 목록]" + ((loginId != null)? ("사용자: " + loginId) : ""));
		System.out.println("-----------------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
		System.out.println("-----------------------------------------------------");
		
		//boards 테이블에서 게시물 정보를 가져와서 출력
		try {
			String sql = "select bno, btitle, bcontent, bwriter, bdate " +
						 "from boards  " +
						 "order by bno desc ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				System.out.printf("%-6s%-12s%-16s%-40s\n",
						board.getBno(),
						board.getBwriter(),
						board.getBdate(),
						board.getBtitle());
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}
		
		//메인 메뉴 출력
		mainMenu();
	}

	//Method - mainMenu()
	public void mainMenu() {
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		if(loginId==null) {
			System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Join | 5.Login | 6.Exit");
			System.out.print("메뉴 선택: ");
			String menuNo = sc.nextLine();
			System.out.println();

			//메뉴 선택 - switch문
			switch(menuNo) {
			case "1" -> create();
			case "2" -> read();
			case "3" -> clear();
			case "4" -> join();
			case "5" -> login();
			case "6" -> exit();
			}
		} else {
			System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Join | 5.Logout | 6.Exit");
			System.out.print("메뉴 선택: ");
			String menuNo = sc.nextLine();
			System.out.println();
			
			//메뉴 선택 - switch문
			switch(menuNo) {
			case "1" -> create();
			case "2" -> read();
			case "3" -> clear();
			case "4" -> join();
			case "5" -> logout();
			case "6" -> exit();
			}
			
		}
		
	}




	//Method - create()
	public void create() {
		//입력 받기
		Board board = new Board();
		System.out.println("[새 게시물 입력]");
		System.out.print("제목: ");
		board.setBtitle(sc.nextLine());
		System.out.print("내용: ");
		board.setBcontent(sc.nextLine());
		
		//로그인한 상태, 로그인한 사용자 아이디를 글쓴이로 사용함
		if(loginId == null) {
			System.out.print("작성자: ");
			board.setBwriter(sc.nextLine());
		} else {
			board.setBwriter(loginId);
		}
		
		
		//보조 메뉴 출력
		System.out.println("-----------------------------------------------------");
		System.out.println("메인 메뉴: 1.Ok | 2.Cancel");
		System.out.print("메뉴 선택: ");
		String menuNo = sc.nextLine();
		if(menuNo.equals("1")) {
			try {
				//boards 테이블에 게시물 정보 저장
				String sql = "INSERT INTO boards (bno, btitle, bcontent, bwriter, bdate) VALUES (SEQ_BNO.NEXTVAL, ?, ?, ?, SYSDATE)";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, board.getBtitle());
				pstmt.setString(2, board.getBcontent());
				pstmt.setString(3, board.getBwriter());
				pstmt.executeUpdate();
				pstmt.close();
			} catch(Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		//게시물 목록 출력
		list();
	}
	
	
	//Method - read()
	public void read() {
		//입력 받기
		System.out.println("[게시물 읽기]");
		System.out.print("bno: ");
		int bno = Integer.parseInt(sc.nextLine());
		
		//boards 테이블에서 해당 게시물을 가져와 출력
		try {
			String sql = "select bno, btitle, bcontent, bwriter, bdate " +
					"from boards " +
					"where bno=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				System.out.println("###############");
				System.out.println("번호: " + board.getBno());
				System.out.println("제목: " + board.getBtitle());
				System.out.println("내용: " + board.getBcontent());
				System.out.println("작성자: " + board.getBwriter());
				System.out.println("날짜: " + board.getBdate());
				System.out.println("###############");
				
				//보조 메뉴 출력
				//로그인하지 않은 상태, 보조 메뉴 출력하지 않고 바로 목록으로 되돌아감
				//로그인한 상태, 사용자 아이디와 글쓴이가 동일할 경우에만 보조 메뉴 출력
				if(loginId != null & loginId.equals(board.getBwriter())) {
					System.out.println("---------------");
					System.out.println("보조 메뉴: 1.Update | 2.Delete | 3.List");
					System.out.print("메뉴 선택: ");
					String menuNo = sc.nextLine();
					System.out.println();
					if(menuNo.equals("1")) {
						update(board);
					} else if(menuNo.equals("2")) {
						delete(board);
					}
				}
			}
			rs.close();
			pstmt.close();
		} catch(Exception e) {
			e.printStackTrace();
			exit();
		}
		list();
	}
	
	
	//Method - read() - update()
	public void update(Board board) {
		//수정 내용 입력 받기
		System.out.println("[수정 내용 입력]");
		System.out.print("제목: ");
		board.setBtitle(sc.nextLine());
		System.out.print("내용: ");
		board.setBcontent(sc.nextLine());
		
		//보조 메뉴 출력
		System.out.println("-----------------------------------------------------");
		System.out.println("메인 메뉴: 1.Ok | 2.Cancel");
		System.out.print("메뉴 선택: ");
		String menuNo = sc.nextLine();
		if(menuNo.equals("1")) {
			try {
				//boards 테이블에 게시물 정보 저장
				String sql = "update boards set btitle=?, bcontent=? where bno=?";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, board.getBtitle());
				pstmt.setString(2, board.getBcontent());
				pstmt.setInt(3, board.getBno());
				pstmt.executeUpdate();
				pstmt.close();
			} catch(Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		//게시물 목록 출력
		list();
	}
	
	
	//Method - read() - delete() - 게시물 일부 삭제
	public void delete(Board board) {
		//boards 테이블에 게시물 정보 삭제
		try {
			String sql = "delete from boards where bno=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, board.getBno());
			pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}
		//게시물 목록 출력
		list();
	}


	//Method - clear() 게시물 전체 삭제
	public void clear() {
		System.out.println("[게시물 전체 삭제]");
		//보조 메뉴 출력
		System.out.println("-----------------------------------------------------");
		System.out.println("메인 메뉴: 1.Ok | 2.Cancel");
		System.out.print("메뉴 선택: ");
		String menuNo = sc.nextLine();
		if(menuNo.equals("1")) {
			//boards 테이블에 게시물 정보 전체 삭제
			try {
				String sql = "truncate table boards";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.executeUpdate();
				pstmt.close();
			} catch(Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		//게시물 목록 출력
		list();
	}
	
	
	//Method - join() 회원가입
	public void join() {
		//입력 받기
		User user = new User();
		System.out.println("[새 사용자 입력]");
		System.out.print("아이디: ");
		user.setUserId(sc.nextLine());
		System.out.print("이름: ");
		user.setUserName(sc.nextLine());
		System.out.print("비밀번호: ");
		user.setUserPassword(sc.nextLine());
		System.out.print("나이: ");
		user.setUserAge(Integer.parseInt(sc.nextLine()));
		System.out.print("이메일: ");
		user.setUserEmail(sc.nextLine());
		
		//보조 메뉴 출력
		System.out.println("-----------------------------------------------------");
		System.out.println("메인 메뉴: 1.Ok | 2.Cancel");
		System.out.print("메뉴 선택: ");
		String menuNo = sc.nextLine();
		if(menuNo.equals("1")) {
			try {
				//boards 테이블에 게시물 정보 저장
				String sql = "INSERT INTO users (userid, username, userpassword, userage, useremail) VALUES (?, ?, ?, ?, ?)";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, user.getUserId());
				pstmt.setString(2, user.getUserName());
				pstmt.setString(3, user.getUserPassword());
				pstmt.setInt(4, user.getUserAge());
				pstmt.setString(5, user.getUserEmail());
				pstmt.executeUpdate();
				pstmt.close();
			} catch(Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		//게시물 목록 출력
		list();
	}

	//Method - login( ) 로그인
	public void login() {
		//입력 받기
		User user = new User();
		System.out.println("[로그인]");
		System.out.print("아이디: ");
		user.setUserId(sc.nextLine());
		System.out.print("비밀번호: ");
		user.setUserPassword(sc.nextLine());

		//보조 메뉴 출력
		System.out.println("---------------");
		System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
		System.out.print("메뉴 선택: ");
		String menuNo = sc.nextLine();
		System.out.println();
		if(menuNo.equals("1")) {
			//boards 테이블에서 해당 게시물을 가져와 출력
			try {
				String sql = "select userpassword " +
						"from users " +
						"where userid=?";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, user.getUserId());
				ResultSet rs = pstmt.executeQuery();
				if(rs.next()) {
					String dbPassword = rs.getString("userpassword");
					if(dbPassword.equals(user.getUserPassword())) {
						loginId = user.getUserId();
					} else {
						System.out.println("비밀번호가 일치하지 않음");
					}
				} else {
					System.out.println("아이디 존재하지 않음");
				}
				rs.close();
				pstmt.close();
			} catch(Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		//게시물 목록 출력
		list();
	}
	
	//Method - logout() 로그아웃
	public void logout() {
		//로그인 아이디 없애기
		loginId = null;
		
		//게시물 목록 출력
		list();
	}
	
	
	//Method - exit()
	public void exit() {
		if(conn != null) {
			try {
				conn.close();
			} catch(SQLException e) {
				
			}
		}
		System.out.println("시스템 종료");
		System.exit(0);
	}

	//Method - main()
	public static void main(String[] args) {
		BoardExample boardExample = new BoardExample();
		boardExample.list();
	}

}
