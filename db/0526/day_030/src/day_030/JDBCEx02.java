package day_030;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBCEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/sample";
		String user = "root";
		String password = "123456";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "select * from emp";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			ResultSetMetaData rsmd = rs.getMetaData();
			
			System.out.println(rsmd.getColumnCount());
			for(int i=1; i<rsmd.getColumnCount(); i++) {
				System.out.print(rsmd.getColumnName(i) + "\t");
				System.out.print(rsmd.getColumnTypeName(i) + "\t");
				System.out.print(rsmd.getPrecision(i) + "\t");
				System.out.print(rsmd.getScale(i) + "\t");
				System.out.print(rsmd.isNullable(i) + "\n");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(rs != null)try { rs.close();}catch(SQLException e) {}
			if(pstmt != null)try { pstmt.close();}catch(SQLException e) {}
			if(conn != null)try { conn.close();}catch(SQLException e) {}
		}
		
	}

}
