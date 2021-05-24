package day_028;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/sample";
		String user = "root";
		String password = "123456";
		
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "insert dept2 value (?, ?, ?)";
			pstmt = conn.prepareStatement( sql );
			pstmt.setString(1,"20");
			pstmt.setString(2,"연구부");
			pstmt.setString(3,"대전");
			
			int result = pstmt.executeUpdate();
			System.out.println("성공" + result);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]:"+e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]:"+e.getMessage());
		}finally {
			if(pstmt != null)try  {pstmt.close();}catch(SQLException e) {}
			if(conn != null)try  {conn.close();}catch(SQLException e) {}
		}
	}

}
