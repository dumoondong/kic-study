package day_027;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class JDBCEx01 {
	public static void main(String[] args) {
		System.out.println("시작");
		
		try {
			// 드라이버 클래스의 동적(실행시) 로딩
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]: " + e.getMessage());
		}
		
		String url = "jdbc:mysql://localhost:3306/sample";
		String user = "root";
		String password = "123456";
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("데이터베이스 연결 성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(conn != null) try { conn.close(); } catch(SQLException e) {}
		}
		
		System.out.println("끝");
	}
}
