package day_027;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class JDBCEx02 {
	public static void main(String[] args) {
		System.out.println("시작");
		
		String url = "jdbc:mysql://localhost:3306/sample";
		String user = "root";
		String password = "123456";
		
		Connection conn = null;
		Statement stmt = null;
		try {
			// 드라이버 클래스의 동적(실행시) 로딩
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로딩 성공");
			
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("데이터베이스 연결 성공");
			
			stmt = conn.createStatement();
			//insert, update, delete / DDL
			//int result = stmt.executeUpdate("insert into dept2 values (10,'개발부','서울')");
			
			String deptno = "11";
			String dname = "개발부";
			String loc = "서울";
			
			//String sql = "insert into dept2 values ("+deptno+",'"+dname+"','"+loc+"')";
			//String sql = String.format("insert into dept2 values ('%s','%s','%s')", deptno,dname,loc);
			//String sql = String.format("update dept2 set loc='%s'", "대전");
			String sql = String.format("delete from dept2");
			
			int result = stmt.executeUpdate(sql);
			
			
			System.out.println("성공 :" + result);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]: " + e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(stmt != null) try { stmt.close(); } catch(SQLException e) {}
			if(conn != null) try { conn.close(); } catch(SQLException e) {}
		}
		
		System.out.println("끝");
	}
}
