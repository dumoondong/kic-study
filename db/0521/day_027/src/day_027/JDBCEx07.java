package day_027;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class JDBCEx07 {
	public static void main(String[] args) {
		System.out.println("시작");
		
		String url = "jdbc:mysql://localhost:3306/sample";
		String user = "root";
		String password = "123456";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 드라이버 클래스의 동적(실행시) 로딩
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로딩 성공");
			
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("데이터베이스 연결 성공");
			
			stmt = conn.createStatement();
			//String sql = "select empno,ename,sal,date_format(hiredate,'%Y/%m/%d') hiredate from emp";
			String sql = String.format("select empno,ename,sal,date_format(hiredate,'%%Y/%%m/%%d') date from emp where deptno=%s","10");
			rs = stmt.executeQuery(sql);
			
			while(rs.next() ) {
				System.out.println(rs.getString("empno"));
				System.out.println(rs.getString("ename"));
				System.out.println(rs.getString("sal"));
				System.out.println(rs.getString("date"));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]: " + e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(rs != null) try { rs.close(); } catch(SQLException e) {}
			if(stmt != null) try { stmt.close(); } catch(SQLException e) {}
			if(conn != null) try { conn.close(); } catch(SQLException e) {}
		}
		
		System.out.println("끝");
	}
}
