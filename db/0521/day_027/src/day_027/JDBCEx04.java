package day_027;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class JDBCEx04 {
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
			
			//DDL
			
			//String sql = "create table dept3 ( deptno int(2), dname varchar(14), loc varchar(13) )";
			
			StringBuffer sql = new StringBuffer();
			sql.append("create table dept4 (");
			sql.append("deptno int(2)");
			sql.append(", dname varchar(14)");
			sql.append(", loc varchar(13)");
			sql.append(")");
			
			
			int result = stmt.executeUpdate(sql.toString());
			
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
