package day_028;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/sample";
		String user = "root";
		String password = "123456";
		
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			
			//String sql = "select * from zipcode where dong=?limit 0,2";
			String sql = "select * from zipcode where dong like ?";
			pstmt = conn.prepareStatement( sql );
			//pstmt.setString(1, "개포동");
			pstmt.setString(1, "개포%");
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("zipcode"));
				System.out.println(rs.getString("dong"));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]:"+e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]:"+e.getMessage());
		}finally {
			if(rs != null)try  {rs.close();}catch(SQLException e) {}
			if(pstmt != null)try  {pstmt.close();}catch(SQLException e) {}
			if(conn != null)try  {conn.close();}catch(SQLException e) {}
		}
	}

}
